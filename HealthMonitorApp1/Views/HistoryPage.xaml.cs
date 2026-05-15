using HealthMonitorApp1.Models;
using HealthMonitorApp1.Services;
using System.Collections.ObjectModel;

namespace HealthMonitorApp1.Views
{
    public partial class HistoryPage : ContentPage
    {
        private ObservableCollection<HealthData> allHealthDataList;
        private ObservableCollection<HealthData> filteredHealthDataList;
        private FirebaseService _firebaseService;

        public HistoryPage(FirebaseService firebaseService)
        {
            InitializeComponent();
            _firebaseService = firebaseService;
            LoadDataFromFirebase();
        }

        private async void LoadDataFromFirebase()
        {
            try
            {
                HistoryCollectionView.IsVisible = false;
                EmptyStateLayout.IsVisible = false;

                allHealthDataList = await _firebaseService.GetHistoryDataAsync();

                if (allHealthDataList != null && allHealthDataList.Count > 0)
                {
                    filteredHealthDataList = new ObservableCollection<HealthData>(allHealthDataList);
                    HistoryCollectionView.ItemsSource = filteredHealthDataList;
                    HistoryCollectionView.IsVisible = true;
                    EmptyStateLayout.IsVisible = false;
                    UpdateFilterButtonStyle("all");
                }
                else
                {
                    HistoryCollectionView.IsVisible = false;
                    EmptyStateLayout.IsVisible = true;
                }
            }
            catch (Exception ex)
            {
                await DisplayAlert("Lỗi", $"Không thể tải dữ liệu: {ex.Message}", "OK");
                EmptyStateLayout.IsVisible = true;
                HistoryCollectionView.IsVisible = false;
            }
        }

        // Không dùng await nên không cần async
        private void FilterToday_Clicked(object sender, EventArgs e)
        {
            if (allHealthDataList == null || allHealthDataList.Count == 0)
            {
                DisplayAlert("Thông báo", "Không có dữ liệu để lọc", "OK");
                return;
            }

            var today = DateTime.Today;
            var filtered = allHealthDataList.Where(data => data.MeasurementTime.Date == today.Date);
            filteredHealthDataList = new ObservableCollection<HealthData>(filtered);
            HistoryCollectionView.ItemsSource = filteredHealthDataList;

            if (filteredHealthDataList.Count == 0)
            {
                DisplayAlert("Thông báo", "Không có dữ liệu trong hôm nay", "OK");
            }

            UpdateFilterButtonStyle("today");
        }

        // Không dùng await nên không cần async
        private void FilterAll_Clicked(object sender, EventArgs e)
        {
            if (allHealthDataList == null || allHealthDataList.Count == 0)
            {
                DisplayAlert("Thông báo", "Không có dữ liệu để hiển thị", "OK");
                return;
            }

            filteredHealthDataList = new ObservableCollection<HealthData>(allHealthDataList);
            HistoryCollectionView.ItemsSource = filteredHealthDataList;
            UpdateFilterButtonStyle("all");
        }

        private void UpdateFilterButtonStyle(string activeFilter)
        {
            if (FilterTodayBtn == null || FilterAllBtn == null) return;

            FilterTodayBtn.BackgroundColor = Colors.LightGray;
            FilterTodayBtn.TextColor = Colors.Gray;
            FilterAllBtn.BackgroundColor = Colors.LightGray;
            FilterAllBtn.TextColor = Colors.Gray;

            switch (activeFilter)
            {
                case "today":
                    FilterTodayBtn.BackgroundColor = Color.FromArgb("#4A90E2");
                    FilterTodayBtn.TextColor = Colors.White;
                    break;
                case "all":
                    FilterAllBtn.BackgroundColor = Color.FromArgb("#4A90E2");
                    FilterAllBtn.TextColor = Colors.White;
                    break;
            }
        }

        private async void BackToMainButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PopAsync();
        }
    }
}