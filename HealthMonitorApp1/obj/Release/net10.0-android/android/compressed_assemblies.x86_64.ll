; ModuleID = 'compressed_assemblies.x86_64.ll'
source_filename = "compressed_assemblies.x86_64.ll"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-unknown-linux-android21"

%struct.CompressedAssemblyDescriptor = type {
	i32, ; uint32_t uncompressed_file_size
	i1, ; bool loaded
	i32 ; uint32_t buffer_offset
}

@compressed_assembly_count = dso_local local_unnamed_addr constant i32 327, align 4

@compressed_assembly_descriptors = dso_local local_unnamed_addr global [327 x %struct.CompressedAssemblyDescriptor] [
	%struct.CompressedAssemblyDescriptor {
		i32 132096, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 0; uint32_t buffer_offset
	}, ; 0: HealthMonitorApp1
	%struct.CompressedAssemblyDescriptor {
		i32 90624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 132096; uint32_t buffer_offset
	}, ; 1: Firebase
	%struct.CompressedAssemblyDescriptor {
		i32 174128, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 222720; uint32_t buffer_offset
	}, ; 2: GoogleGson
	%struct.CompressedAssemblyDescriptor {
		i32 361984, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 396848; uint32_t buffer_offset
	}, ; 3: LiteDB
	%struct.CompressedAssemblyDescriptor {
		i32 45320, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 758832; uint32_t buffer_offset
	}, ; 4: Microsoft.Extensions.Configuration
	%struct.CompressedAssemblyDescriptor {
		i32 28984, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 804152; uint32_t buffer_offset
	}, ; 5: Microsoft.Extensions.Configuration.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 96008, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 833136; uint32_t buffer_offset
	}, ; 6: Microsoft.Extensions.DependencyInjection
	%struct.CompressedAssemblyDescriptor {
		i32 66312, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 929144; uint32_t buffer_offset
	}, ; 7: Microsoft.Extensions.DependencyInjection.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 31504, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 995456; uint32_t buffer_offset
	}, ; 8: Microsoft.Extensions.Diagnostics.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 23864, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1026960; uint32_t buffer_offset
	}, ; 9: Microsoft.Extensions.FileProviders.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 54536, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1050824; uint32_t buffer_offset
	}, ; 10: Microsoft.Extensions.Hosting.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 52016, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1105360; uint32_t buffer_offset
	}, ; 11: Microsoft.Extensions.Logging
	%struct.CompressedAssemblyDescriptor {
		i32 67344, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1157376; uint32_t buffer_offset
	}, ; 12: Microsoft.Extensions.Logging.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 20240, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1224720; uint32_t buffer_offset
	}, ; 13: Microsoft.Extensions.Logging.Debug
	%struct.CompressedAssemblyDescriptor {
		i32 65848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1244960; uint32_t buffer_offset
	}, ; 14: Microsoft.Extensions.Options
	%struct.CompressedAssemblyDescriptor {
		i32 45328, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1310808; uint32_t buffer_offset
	}, ; 15: Microsoft.Extensions.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 1928504, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 1356136; uint32_t buffer_offset
	}, ; 16: Microsoft.Maui.Controls
	%struct.CompressedAssemblyDescriptor {
		i32 135432, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 3284640; uint32_t buffer_offset
	}, ; 17: Microsoft.Maui.Controls.Xaml
	%struct.CompressedAssemblyDescriptor {
		i32 862208, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 3420072; uint32_t buffer_offset
	}, ; 18: Microsoft.Maui
	%struct.CompressedAssemblyDescriptor {
		i32 280848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 4282280; uint32_t buffer_offset
	}, ; 19: Microsoft.Maui.Essentials
	%struct.CompressedAssemblyDescriptor {
		i32 208696, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 4563128; uint32_t buffer_offset
	}, ; 20: Microsoft.Maui.Graphics
	%struct.CompressedAssemblyDescriptor {
		i32 695336, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 4771824; uint32_t buffer_offset
	}, ; 21: Newtonsoft.Json
	%struct.CompressedAssemblyDescriptor {
		i32 1196544, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5467160; uint32_t buffer_offset
	}, ; 22: System.Reactive
	%struct.CompressedAssemblyDescriptor {
		i32 1176064, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6663704; uint32_t buffer_offset
	}, ; 23: Xamarin.Android.Glide
	%struct.CompressedAssemblyDescriptor {
		i32 15944, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7839768; uint32_t buffer_offset
	}, ; 24: Xamarin.Android.Glide.Annotations
	%struct.CompressedAssemblyDescriptor {
		i32 25632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7855712; uint32_t buffer_offset
	}, ; 25: Xamarin.Android.Glide.DiskLruCache
	%struct.CompressedAssemblyDescriptor {
		i32 63032, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7881344; uint32_t buffer_offset
	}, ; 26: Xamarin.Android.Glide.GifDecoder
	%struct.CompressedAssemblyDescriptor {
		i32 186880, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7944376; uint32_t buffer_offset
	}, ; 27: Xamarin.AndroidX.Activity
	%struct.CompressedAssemblyDescriptor {
		i32 15928, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8131256; uint32_t buffer_offset
	}, ; 28: Xamarin.AndroidX.Activity.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 15912, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8147184; uint32_t buffer_offset
	}, ; 29: Xamarin.AndroidX.Annotation
	%struct.CompressedAssemblyDescriptor {
		i32 38432, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8163096; uint32_t buffer_offset
	}, ; 30: Xamarin.AndroidX.Annotation.Experimental
	%struct.CompressedAssemblyDescriptor {
		i32 215608, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8201528; uint32_t buffer_offset
	}, ; 31: Xamarin.AndroidX.Annotation.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 1293312, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8417136; uint32_t buffer_offset
	}, ; 32: Xamarin.AndroidX.AppCompat
	%struct.CompressedAssemblyDescriptor {
		i32 93184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9710448; uint32_t buffer_offset
	}, ; 33: Xamarin.AndroidX.AppCompat.AppCompatResources
	%struct.CompressedAssemblyDescriptor {
		i32 38984, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9803632; uint32_t buffer_offset
	}, ; 34: Xamarin.AndroidX.Arch.Core.Common
	%struct.CompressedAssemblyDescriptor {
		i32 28192, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9842616; uint32_t buffer_offset
	}, ; 35: Xamarin.AndroidX.Arch.Core.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 399360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9870808; uint32_t buffer_offset
	}, ; 36: Xamarin.AndroidX.Browser
	%struct.CompressedAssemblyDescriptor {
		i32 35400, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10270168; uint32_t buffer_offset
	}, ; 37: Xamarin.AndroidX.CardView
	%struct.CompressedAssemblyDescriptor {
		i32 15944, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10305568; uint32_t buffer_offset
	}, ; 38: Xamarin.AndroidX.Collection
	%struct.CompressedAssemblyDescriptor {
		i32 628768, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10321512; uint32_t buffer_offset
	}, ; 39: Xamarin.AndroidX.Collection.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 15904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10950280; uint32_t buffer_offset
	}, ; 40: Xamarin.AndroidX.Collection.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 36424, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10966184; uint32_t buffer_offset
	}, ; 41: Xamarin.AndroidX.Concurrent.Futures
	%struct.CompressedAssemblyDescriptor {
		i32 741888, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11002608; uint32_t buffer_offset
	}, ; 42: Xamarin.AndroidX.ConstraintLayout
	%struct.CompressedAssemblyDescriptor {
		i32 1466936, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11744496; uint32_t buffer_offset
	}, ; 43: Xamarin.AndroidX.ConstraintLayout.Core
	%struct.CompressedAssemblyDescriptor {
		i32 102400, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 13211432; uint32_t buffer_offset
	}, ; 44: Xamarin.AndroidX.CoordinatorLayout
	%struct.CompressedAssemblyDescriptor {
		i32 2224640, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 13313832; uint32_t buffer_offset
	}, ; 45: Xamarin.AndroidX.Core
	%struct.CompressedAssemblyDescriptor {
		i32 216608, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15538472; uint32_t buffer_offset
	}, ; 46: Xamarin.AndroidX.Core.Core.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 20016, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15755080; uint32_t buffer_offset
	}, ; 47: Xamarin.AndroidX.Core.ViewTree
	%struct.CompressedAssemblyDescriptor {
		i32 64040, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15775096; uint32_t buffer_offset
	}, ; 48: Xamarin.AndroidX.CursorAdapter
	%struct.CompressedAssemblyDescriptor {
		i32 74776, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15839136; uint32_t buffer_offset
	}, ; 49: Xamarin.AndroidX.CustomView
	%struct.CompressedAssemblyDescriptor {
		i32 15360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15913912; uint32_t buffer_offset
	}, ; 50: Xamarin.AndroidX.CustomView.PoolingContainer
	%struct.CompressedAssemblyDescriptor {
		i32 57856, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15929272; uint32_t buffer_offset
	}, ; 51: Xamarin.AndroidX.DrawerLayout
	%struct.CompressedAssemblyDescriptor {
		i32 62976, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15987128; uint32_t buffer_offset
	}, ; 52: Xamarin.AndroidX.DynamicAnimation
	%struct.CompressedAssemblyDescriptor {
		i32 288816, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16050104; uint32_t buffer_offset
	}, ; 53: Xamarin.AndroidX.Emoji2
	%struct.CompressedAssemblyDescriptor {
		i32 26144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16338920; uint32_t buffer_offset
	}, ; 54: Xamarin.AndroidX.Emoji2.ViewsHelper
	%struct.CompressedAssemblyDescriptor {
		i32 73288, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16365064; uint32_t buffer_offset
	}, ; 55: Xamarin.AndroidX.ExifInterface
	%struct.CompressedAssemblyDescriptor {
		i32 375808, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16438352; uint32_t buffer_offset
	}, ; 56: Xamarin.AndroidX.Fragment
	%struct.CompressedAssemblyDescriptor {
		i32 27192, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16814160; uint32_t buffer_offset
	}, ; 57: Xamarin.AndroidX.Fragment.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 26152, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16841352; uint32_t buffer_offset
	}, ; 58: Xamarin.AndroidX.Interpolator
	%struct.CompressedAssemblyDescriptor {
		i32 16952, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16867504; uint32_t buffer_offset
	}, ; 59: Xamarin.AndroidX.Lifecycle.Common
	%struct.CompressedAssemblyDescriptor {
		i32 71200, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16884456; uint32_t buffer_offset
	}, ; 60: Xamarin.AndroidX.Lifecycle.Common.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 39464, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16955656; uint32_t buffer_offset
	}, ; 61: Xamarin.AndroidX.Lifecycle.LiveData
	%struct.CompressedAssemblyDescriptor {
		i32 36936, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 16995120; uint32_t buffer_offset
	}, ; 62: Xamarin.AndroidX.Lifecycle.LiveData.Core
	%struct.CompressedAssemblyDescriptor {
		i32 16440, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17032056; uint32_t buffer_offset
	}, ; 63: Xamarin.AndroidX.Lifecycle.LiveData.Core.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 22584, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17048496; uint32_t buffer_offset
	}, ; 64: Xamarin.AndroidX.Lifecycle.Process
	%struct.CompressedAssemblyDescriptor {
		i32 15416, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17071080; uint32_t buffer_offset
	}, ; 65: Xamarin.AndroidX.Lifecycle.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 44032, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17086496; uint32_t buffer_offset
	}, ; 66: Xamarin.AndroidX.Lifecycle.Runtime.Android
	%struct.CompressedAssemblyDescriptor {
		i32 15904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17130528; uint32_t buffer_offset
	}, ; 67: Xamarin.AndroidX.Lifecycle.Runtime.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 16456, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17146432; uint32_t buffer_offset
	}, ; 68: Xamarin.AndroidX.Lifecycle.Runtime.Ktx.Android
	%struct.CompressedAssemblyDescriptor {
		i32 16928, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17162888; uint32_t buffer_offset
	}, ; 69: Xamarin.AndroidX.Lifecycle.ViewModel
	%struct.CompressedAssemblyDescriptor {
		i32 88632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17179816; uint32_t buffer_offset
	}, ; 70: Xamarin.AndroidX.Lifecycle.ViewModel.Android
	%struct.CompressedAssemblyDescriptor {
		i32 16440, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17268448; uint32_t buffer_offset
	}, ; 71: Xamarin.AndroidX.Lifecycle.ViewModel.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 15928, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17284888; uint32_t buffer_offset
	}, ; 72: Xamarin.AndroidX.Lifecycle.ViewModelSavedState
	%struct.CompressedAssemblyDescriptor {
		i32 48200, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17300816; uint32_t buffer_offset
	}, ; 73: Xamarin.AndroidX.Lifecycle.ViewModelSavedState.Android
	%struct.CompressedAssemblyDescriptor {
		i32 61440, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17349016; uint32_t buffer_offset
	}, ; 74: Xamarin.AndroidX.Loader
	%struct.CompressedAssemblyDescriptor {
		i32 15904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17410456; uint32_t buffer_offset
	}, ; 75: Xamarin.AndroidX.Navigation.Common
	%struct.CompressedAssemblyDescriptor {
		i32 233016, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17426360; uint32_t buffer_offset
	}, ; 76: Xamarin.AndroidX.Navigation.Common.Android
	%struct.CompressedAssemblyDescriptor {
		i32 60960, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17659376; uint32_t buffer_offset
	}, ; 77: Xamarin.AndroidX.Navigation.Fragment
	%struct.CompressedAssemblyDescriptor {
		i32 15928, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17720336; uint32_t buffer_offset
	}, ; 78: Xamarin.AndroidX.Navigation.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 114688, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17736264; uint32_t buffer_offset
	}, ; 79: Xamarin.AndroidX.Navigation.Runtime.Android
	%struct.CompressedAssemblyDescriptor {
		i32 47104, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17850952; uint32_t buffer_offset
	}, ; 80: Xamarin.AndroidX.Navigation.UI
	%struct.CompressedAssemblyDescriptor {
		i32 52784, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17898056; uint32_t buffer_offset
	}, ; 81: Xamarin.AndroidX.ProfileInstaller.ProfileInstaller
	%struct.CompressedAssemblyDescriptor {
		i32 660992, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 17950840; uint32_t buffer_offset
	}, ; 82: Xamarin.AndroidX.RecyclerView
	%struct.CompressedAssemblyDescriptor {
		i32 30792, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18611832; uint32_t buffer_offset
	}, ; 83: Xamarin.AndroidX.ResourceInspection.Annotation
	%struct.CompressedAssemblyDescriptor {
		i32 15912, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18642624; uint32_t buffer_offset
	}, ; 84: Xamarin.AndroidX.SavedState
	%struct.CompressedAssemblyDescriptor {
		i32 91688, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18658536; uint32_t buffer_offset
	}, ; 85: Xamarin.AndroidX.SavedState.SavedState.Android
	%struct.CompressedAssemblyDescriptor {
		i32 16416, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18750224; uint32_t buffer_offset
	}, ; 86: Xamarin.AndroidX.SavedState.SavedState.Ktx
	%struct.CompressedAssemblyDescriptor {
		i32 46648, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18766640; uint32_t buffer_offset
	}, ; 87: Xamarin.AndroidX.Security.SecurityCrypto
	%struct.CompressedAssemblyDescriptor {
		i32 39936, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18813288; uint32_t buffer_offset
	}, ; 88: Xamarin.AndroidX.SlidingPaneLayout
	%struct.CompressedAssemblyDescriptor {
		i32 31304, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18853224; uint32_t buffer_offset
	}, ; 89: Xamarin.AndroidX.Startup.StartupRuntime
	%struct.CompressedAssemblyDescriptor {
		i32 67584, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18884528; uint32_t buffer_offset
	}, ; 90: Xamarin.AndroidX.SwipeRefreshLayout
	%struct.CompressedAssemblyDescriptor {
		i32 15392, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18952112; uint32_t buffer_offset
	}, ; 91: Xamarin.AndroidX.Tracing.Tracing
	%struct.CompressedAssemblyDescriptor {
		i32 24104, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18967504; uint32_t buffer_offset
	}, ; 92: Xamarin.AndroidX.Tracing.Tracing.Android
	%struct.CompressedAssemblyDescriptor {
		i32 175104, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 18991608; uint32_t buffer_offset
	}, ; 93: Xamarin.AndroidX.Transition
	%struct.CompressedAssemblyDescriptor {
		i32 36384, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19166712; uint32_t buffer_offset
	}, ; 94: Xamarin.AndroidX.VectorDrawable
	%struct.CompressedAssemblyDescriptor {
		i32 49184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19203096; uint32_t buffer_offset
	}, ; 95: Xamarin.AndroidX.VectorDrawable.Animated
	%struct.CompressedAssemblyDescriptor {
		i32 122936, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19252280; uint32_t buffer_offset
	}, ; 96: Xamarin.AndroidX.VersionedParcelable
	%struct.CompressedAssemblyDescriptor {
		i32 86016, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19375216; uint32_t buffer_offset
	}, ; 97: Xamarin.AndroidX.ViewPager
	%struct.CompressedAssemblyDescriptor {
		i32 64512, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19461232; uint32_t buffer_offset
	}, ; 98: Xamarin.AndroidX.ViewPager2
	%struct.CompressedAssemblyDescriptor {
		i32 271904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19525744; uint32_t buffer_offset
	}, ; 99: Xamarin.AndroidX.Window
	%struct.CompressedAssemblyDescriptor {
		i32 15904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19797648; uint32_t buffer_offset
	}, ; 100: Xamarin.AndroidX.Window.WindowCore
	%struct.CompressedAssemblyDescriptor {
		i32 35360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19813552; uint32_t buffer_offset
	}, ; 101: Xamarin.AndroidX.Window.WindowCore.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 2774016, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 19848912; uint32_t buffer_offset
	}, ; 102: Xamarin.Google.Android.Material
	%struct.CompressedAssemblyDescriptor {
		i32 102432, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 22622928; uint32_t buffer_offset
	}, ; 103: Jsr305Binding
	%struct.CompressedAssemblyDescriptor {
		i32 5886976, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 22725360; uint32_t buffer_offset
	}, ; 104: Xamarin.Google.Crypto.Tink.Android
	%struct.CompressedAssemblyDescriptor {
		i32 101944, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 28612336; uint32_t buffer_offset
	}, ; 105: Xamarin.Google.ErrorProne.Annotations
	%struct.CompressedAssemblyDescriptor {
		i32 27192, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 28714280; uint32_t buffer_offset
	}, ; 106: Xamarin.Google.Guava.ListenableFuture
	%struct.CompressedAssemblyDescriptor {
		i32 165944, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 28741472; uint32_t buffer_offset
	}, ; 107: Xamarin.Jetbrains.Annotations
	%struct.CompressedAssemblyDescriptor {
		i32 28728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 28907416; uint32_t buffer_offset
	}, ; 108: Xamarin.JSpecify
	%struct.CompressedAssemblyDescriptor {
		i32 2375680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 28936144; uint32_t buffer_offset
	}, ; 109: Xamarin.Kotlin.StdLib
	%struct.CompressedAssemblyDescriptor {
		i32 27680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 31311824; uint32_t buffer_offset
	}, ; 110: Xamarin.KotlinX.Coroutines.Android
	%struct.CompressedAssemblyDescriptor {
		i32 16432, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 31339504; uint32_t buffer_offset
	}, ; 111: Xamarin.KotlinX.Coroutines.Core
	%struct.CompressedAssemblyDescriptor {
		i32 568880, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 31355936; uint32_t buffer_offset
	}, ; 112: Xamarin.KotlinX.Coroutines.Core.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 16416, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 31924816; uint32_t buffer_offset
	}, ; 113: Xamarin.KotlinX.Serialization.Core
	%struct.CompressedAssemblyDescriptor {
		i32 312376, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 31941232; uint32_t buffer_offset
	}, ; 114: Xamarin.KotlinX.Serialization.Core.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32253608; uint32_t buffer_offset
	}, ; 115: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32269232; uint32_t buffer_offset
	}, ; 116: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32284864; uint32_t buffer_offset
	}, ; 117: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32300488; uint32_t buffer_offset
	}, ; 118: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32316112; uint32_t buffer_offset
	}, ; 119: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32331744; uint32_t buffer_offset
	}, ; 120: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32347376; uint32_t buffer_offset
	}, ; 121: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32363008; uint32_t buffer_offset
	}, ; 122: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32378632; uint32_t buffer_offset
	}, ; 123: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32394256; uint32_t buffer_offset
	}, ; 124: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32409888; uint32_t buffer_offset
	}, ; 125: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32425512; uint32_t buffer_offset
	}, ; 126: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32441136; uint32_t buffer_offset
	}, ; 127: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32456760; uint32_t buffer_offset
	}, ; 128: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32472384; uint32_t buffer_offset
	}, ; 129: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32488008; uint32_t buffer_offset
	}, ; 130: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32503632; uint32_t buffer_offset
	}, ; 131: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32519256; uint32_t buffer_offset
	}, ; 132: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32534880; uint32_t buffer_offset
	}, ; 133: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15664, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32550512; uint32_t buffer_offset
	}, ; 134: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32566176; uint32_t buffer_offset
	}, ; 135: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32581800; uint32_t buffer_offset
	}, ; 136: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32597432; uint32_t buffer_offset
	}, ; 137: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32613064; uint32_t buffer_offset
	}, ; 138: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32628696; uint32_t buffer_offset
	}, ; 139: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32644368; uint32_t buffer_offset
	}, ; 140: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15664, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32660000; uint32_t buffer_offset
	}, ; 141: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32675664; uint32_t buffer_offset
	}, ; 142: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32691288; uint32_t buffer_offset
	}, ; 143: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32706912; uint32_t buffer_offset
	}, ; 144: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32722536; uint32_t buffer_offset
	}, ; 145: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15664, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32738160; uint32_t buffer_offset
	}, ; 146: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32753824; uint32_t buffer_offset
	}, ; 147: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32769448; uint32_t buffer_offset
	}, ; 148: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 719360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 32785080; uint32_t buffer_offset
	}, ; 149: _Microsoft.Android.Resource.Designer
	%struct.CompressedAssemblyDescriptor {
		i32 312120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 33504440; uint32_t buffer_offset
	}, ; 150: Microsoft.CSharp
	%struct.CompressedAssemblyDescriptor {
		i32 429320, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 33816560; uint32_t buffer_offset
	}, ; 151: Microsoft.VisualBasic.Core
	%struct.CompressedAssemblyDescriptor {
		i32 17680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34245880; uint32_t buffer_offset
	}, ; 152: Microsoft.VisualBasic
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34263560; uint32_t buffer_offset
	}, ; 153: Microsoft.Win32.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 33552, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34279704; uint32_t buffer_offset
	}, ; 154: Microsoft.Win32.Registry
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34313256; uint32_t buffer_offset
	}, ; 155: System.AppContext
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34328888; uint32_t buffer_offset
	}, ; 156: System.Buffers
	%struct.CompressedAssemblyDescriptor {
		i32 89352, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34344520; uint32_t buffer_offset
	}, ; 157: System.Collections.Concurrent
	%struct.CompressedAssemblyDescriptor {
		i32 251664, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34433872; uint32_t buffer_offset
	}, ; 158: System.Collections.Immutable
	%struct.CompressedAssemblyDescriptor {
		i32 48400, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34685536; uint32_t buffer_offset
	}, ; 159: System.Collections.NonGeneric
	%struct.CompressedAssemblyDescriptor {
		i32 48432, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34733936; uint32_t buffer_offset
	}, ; 160: System.Collections.Specialized
	%struct.CompressedAssemblyDescriptor {
		i32 113416, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34782368; uint32_t buffer_offset
	}, ; 161: System.Collections
	%struct.CompressedAssemblyDescriptor {
		i32 103216, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34895784; uint32_t buffer_offset
	}, ; 162: System.ComponentModel.Annotations
	%struct.CompressedAssemblyDescriptor {
		i32 17208, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 34999000; uint32_t buffer_offset
	}, ; 163: System.ComponentModel.DataAnnotations
	%struct.CompressedAssemblyDescriptor {
		i32 26928, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35016208; uint32_t buffer_offset
	}, ; 164: System.ComponentModel.EventBasedAsync
	%struct.CompressedAssemblyDescriptor {
		i32 42768, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35043136; uint32_t buffer_offset
	}, ; 165: System.ComponentModel.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 317232, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35085904; uint32_t buffer_offset
	}, ; 166: System.ComponentModel.TypeConverter
	%struct.CompressedAssemblyDescriptor {
		i32 16688, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35403136; uint32_t buffer_offset
	}, ; 167: System.ComponentModel
	%struct.CompressedAssemblyDescriptor {
		i32 19760, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35419824; uint32_t buffer_offset
	}, ; 168: System.Configuration
	%struct.CompressedAssemblyDescriptor {
		i32 51000, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35439584; uint32_t buffer_offset
	}, ; 169: System.Console
	%struct.CompressedAssemblyDescriptor {
		i32 23824, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35490584; uint32_t buffer_offset
	}, ; 170: System.Core
	%struct.CompressedAssemblyDescriptor {
		i32 1018640, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 35514408; uint32_t buffer_offset
	}, ; 171: System.Data.Common
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36533048; uint32_t buffer_offset
	}, ; 172: System.Data.DataSetExtensions
	%struct.CompressedAssemblyDescriptor {
		i32 25872, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36549192; uint32_t buffer_offset
	}, ; 173: System.Data
	%struct.CompressedAssemblyDescriptor {
		i32 16648, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36575064; uint32_t buffer_offset
	}, ; 174: System.Diagnostics.Contracts
	%struct.CompressedAssemblyDescriptor {
		i32 16176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36591712; uint32_t buffer_offset
	}, ; 175: System.Diagnostics.Debug
	%struct.CompressedAssemblyDescriptor {
		i32 203024, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36607888; uint32_t buffer_offset
	}, ; 176: System.Diagnostics.DiagnosticSource
	%struct.CompressedAssemblyDescriptor {
		i32 29968, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36810912; uint32_t buffer_offset
	}, ; 177: System.Diagnostics.FileVersionInfo
	%struct.CompressedAssemblyDescriptor {
		i32 129336, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36840880; uint32_t buffer_offset
	}, ; 178: System.Diagnostics.Process
	%struct.CompressedAssemblyDescriptor {
		i32 26424, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36970216; uint32_t buffer_offset
	}, ; 179: System.Diagnostics.StackTrace
	%struct.CompressedAssemblyDescriptor {
		i32 32008, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 36996640; uint32_t buffer_offset
	}, ; 180: System.Diagnostics.TextWriterTraceListener
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37028648; uint32_t buffer_offset
	}, ; 181: System.Diagnostics.Tools
	%struct.CompressedAssemblyDescriptor {
		i32 59152, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37044320; uint32_t buffer_offset
	}, ; 182: System.Diagnostics.TraceSource
	%struct.CompressedAssemblyDescriptor {
		i32 16688, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37103472; uint32_t buffer_offset
	}, ; 183: System.Diagnostics.Tracing
	%struct.CompressedAssemblyDescriptor {
		i32 65296, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37120160; uint32_t buffer_offset
	}, ; 184: System.Drawing.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 20792, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37185456; uint32_t buffer_offset
	}, ; 185: System.Drawing
	%struct.CompressedAssemblyDescriptor {
		i32 16696, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37206248; uint32_t buffer_offset
	}, ; 186: System.Dynamic.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 97552, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37222944; uint32_t buffer_offset
	}, ; 187: System.Formats.Asn1
	%struct.CompressedAssemblyDescriptor {
		i32 121616, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37320496; uint32_t buffer_offset
	}, ; 188: System.Formats.Tar
	%struct.CompressedAssemblyDescriptor {
		i32 16184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37442112; uint32_t buffer_offset
	}, ; 189: System.Globalization.Calendars
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37458296; uint32_t buffer_offset
	}, ; 190: System.Globalization.Extensions
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37473968; uint32_t buffer_offset
	}, ; 191: System.Globalization
	%struct.CompressedAssemblyDescriptor {
		i32 41736, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37490112; uint32_t buffer_offset
	}, ; 192: System.IO.Compression.Brotli
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37531848; uint32_t buffer_offset
	}, ; 193: System.IO.Compression.FileSystem
	%struct.CompressedAssemblyDescriptor {
		i32 54024, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37547480; uint32_t buffer_offset
	}, ; 194: System.IO.Compression.ZipFile
	%struct.CompressedAssemblyDescriptor {
		i32 168248, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37601504; uint32_t buffer_offset
	}, ; 195: System.IO.Compression
	%struct.CompressedAssemblyDescriptor {
		i32 32528, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37769752; uint32_t buffer_offset
	}, ; 196: System.IO.FileSystem.AccessControl
	%struct.CompressedAssemblyDescriptor {
		i32 52024, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37802280; uint32_t buffer_offset
	}, ; 197: System.IO.FileSystem.DriveInfo
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37854304; uint32_t buffer_offset
	}, ; 198: System.IO.FileSystem.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 55568, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37869976; uint32_t buffer_offset
	}, ; 199: System.IO.FileSystem.Watcher
	%struct.CompressedAssemblyDescriptor {
		i32 16176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37925544; uint32_t buffer_offset
	}, ; 200: System.IO.FileSystem
	%struct.CompressedAssemblyDescriptor {
		i32 43784, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37941720; uint32_t buffer_offset
	}, ; 201: System.IO.IsolatedStorage
	%struct.CompressedAssemblyDescriptor {
		i32 50448, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 37985504; uint32_t buffer_offset
	}, ; 202: System.IO.MemoryMappedFiles
	%struct.CompressedAssemblyDescriptor {
		i32 78600, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38035952; uint32_t buffer_offset
	}, ; 203: System.IO.Pipelines
	%struct.CompressedAssemblyDescriptor {
		i32 23824, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38114552; uint32_t buffer_offset
	}, ; 204: System.IO.Pipes.AccessControl
	%struct.CompressedAssemblyDescriptor {
		i32 67888, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38138376; uint32_t buffer_offset
	}, ; 205: System.IO.Pipes
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38206264; uint32_t buffer_offset
	}, ; 206: System.IO.UnmanagedMemoryStream
	%struct.CompressedAssemblyDescriptor {
		i32 16136, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38222408; uint32_t buffer_offset
	}, ; 207: System.IO
	%struct.CompressedAssemblyDescriptor {
		i32 457008, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38238544; uint32_t buffer_offset
	}, ; 208: System.Linq.AsyncEnumerable
	%struct.CompressedAssemblyDescriptor {
		i32 575760, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 38695552; uint32_t buffer_offset
	}, ; 209: System.Linq.Expressions
	%struct.CompressedAssemblyDescriptor {
		i32 223504, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 39271312; uint32_t buffer_offset
	}, ; 210: System.Linq.Parallel
	%struct.CompressedAssemblyDescriptor {
		i32 79120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 39494816; uint32_t buffer_offset
	}, ; 211: System.Linq.Queryable
	%struct.CompressedAssemblyDescriptor {
		i32 201528, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 39573936; uint32_t buffer_offset
	}, ; 212: System.Linq
	%struct.CompressedAssemblyDescriptor {
		i32 56072, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 39775464; uint32_t buffer_offset
	}, ; 213: System.Memory
	%struct.CompressedAssemblyDescriptor {
		i32 56592, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 39831536; uint32_t buffer_offset
	}, ; 214: System.Net.Http.Json
	%struct.CompressedAssemblyDescriptor {
		i32 680720, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 39888128; uint32_t buffer_offset
	}, ; 215: System.Net.Http
	%struct.CompressedAssemblyDescriptor {
		i32 132880, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 40568848; uint32_t buffer_offset
	}, ; 216: System.Net.HttpListener
	%struct.CompressedAssemblyDescriptor {
		i32 175408, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 40701728; uint32_t buffer_offset
	}, ; 217: System.Net.Mail
	%struct.CompressedAssemblyDescriptor {
		i32 53000, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 40877136; uint32_t buffer_offset
	}, ; 218: System.Net.NameResolution
	%struct.CompressedAssemblyDescriptor {
		i32 66872, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 40930136; uint32_t buffer_offset
	}, ; 219: System.Net.NetworkInformation
	%struct.CompressedAssemblyDescriptor {
		i32 56072, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 40997008; uint32_t buffer_offset
	}, ; 220: System.Net.Ping
	%struct.CompressedAssemblyDescriptor {
		i32 109360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41053080; uint32_t buffer_offset
	}, ; 221: System.Net.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 172304, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41162440; uint32_t buffer_offset
	}, ; 222: System.Net.Quic
	%struct.CompressedAssemblyDescriptor {
		i32 162104, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41334744; uint32_t buffer_offset
	}, ; 223: System.Net.Requests
	%struct.CompressedAssemblyDescriptor {
		i32 255760, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41496848; uint32_t buffer_offset
	}, ; 224: System.Net.Security
	%struct.CompressedAssemblyDescriptor {
		i32 41272, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41752608; uint32_t buffer_offset
	}, ; 225: System.Net.ServerSentEvents
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41793880; uint32_t buffer_offset
	}, ; 226: System.Net.ServicePoint
	%struct.CompressedAssemblyDescriptor {
		i32 238896, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 41809512; uint32_t buffer_offset
	}, ; 227: System.Net.Sockets
	%struct.CompressedAssemblyDescriptor {
		i32 70920, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42048408; uint32_t buffer_offset
	}, ; 228: System.Net.WebClient
	%struct.CompressedAssemblyDescriptor {
		i32 33552, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42119328; uint32_t buffer_offset
	}, ; 229: System.Net.WebHeaderCollection
	%struct.CompressedAssemblyDescriptor {
		i32 23816, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42152880; uint32_t buffer_offset
	}, ; 230: System.Net.WebProxy
	%struct.CompressedAssemblyDescriptor {
		i32 51984, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42176696; uint32_t buffer_offset
	}, ; 231: System.Net.WebSockets.Client
	%struct.CompressedAssemblyDescriptor {
		i32 108856, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42228680; uint32_t buffer_offset
	}, ; 232: System.Net.WebSockets
	%struct.CompressedAssemblyDescriptor {
		i32 17680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42337536; uint32_t buffer_offset
	}, ; 233: System.Net
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42355216; uint32_t buffer_offset
	}, ; 234: System.Numerics.Vectors
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42371360; uint32_t buffer_offset
	}, ; 235: System.Numerics
	%struct.CompressedAssemblyDescriptor {
		i32 41744, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42386984; uint32_t buffer_offset
	}, ; 236: System.ObjectModel
	%struct.CompressedAssemblyDescriptor {
		i32 859952, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 42428728; uint32_t buffer_offset
	}, ; 237: System.Private.DataContractSerialization
	%struct.CompressedAssemblyDescriptor {
		i32 106256, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 43288680; uint32_t buffer_offset
	}, ; 238: System.Private.Uri
	%struct.CompressedAssemblyDescriptor {
		i32 154384, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 43394936; uint32_t buffer_offset
	}, ; 239: System.Private.Xml.Linq
	%struct.CompressedAssemblyDescriptor {
		i32 3106576, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 43549320; uint32_t buffer_offset
	}, ; 240: System.Private.Xml
	%struct.CompressedAssemblyDescriptor {
		i32 38664, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46655896; uint32_t buffer_offset
	}, ; 241: System.Reflection.DispatchProxy
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46694560; uint32_t buffer_offset
	}, ; 242: System.Reflection.Emit.ILGeneration
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46710704; uint32_t buffer_offset
	}, ; 243: System.Reflection.Emit.Lightweight
	%struct.CompressedAssemblyDescriptor {
		i32 133384, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46726848; uint32_t buffer_offset
	}, ; 244: System.Reflection.Emit
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46860232; uint32_t buffer_offset
	}, ; 245: System.Reflection.Extensions
	%struct.CompressedAssemblyDescriptor {
		i32 504112, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46875864; uint32_t buffer_offset
	}, ; 246: System.Reflection.Metadata
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47379976; uint32_t buffer_offset
	}, ; 247: System.Reflection.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 24840, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47396120; uint32_t buffer_offset
	}, ; 248: System.Reflection.TypeExtensions
	%struct.CompressedAssemblyDescriptor {
		i32 16688, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47420960; uint32_t buffer_offset
	}, ; 249: System.Reflection
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47437648; uint32_t buffer_offset
	}, ; 250: System.Resources.Reader
	%struct.CompressedAssemblyDescriptor {
		i32 16136, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47453272; uint32_t buffer_offset
	}, ; 251: System.Resources.ResourceManager
	%struct.CompressedAssemblyDescriptor {
		i32 27408, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47469408; uint32_t buffer_offset
	}, ; 252: System.Resources.Writer
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47496816; uint32_t buffer_offset
	}, ; 253: System.Runtime.CompilerServices.Unsafe
	%struct.CompressedAssemblyDescriptor {
		i32 17680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47512448; uint32_t buffer_offset
	}, ; 254: System.Runtime.CompilerServices.VisualC
	%struct.CompressedAssemblyDescriptor {
		i32 18184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47530128; uint32_t buffer_offset
	}, ; 255: System.Runtime.Extensions
	%struct.CompressedAssemblyDescriptor {
		i32 16176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47548312; uint32_t buffer_offset
	}, ; 256: System.Runtime.Handles
	%struct.CompressedAssemblyDescriptor {
		i32 38672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47564488; uint32_t buffer_offset
	}, ; 257: System.Runtime.InteropServices.JavaScript
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47603160; uint32_t buffer_offset
	}, ; 258: System.Runtime.InteropServices.RuntimeInformation
	%struct.CompressedAssemblyDescriptor {
		i32 65296, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47618784; uint32_t buffer_offset
	}, ; 259: System.Runtime.InteropServices
	%struct.CompressedAssemblyDescriptor {
		i32 17712, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47684080; uint32_t buffer_offset
	}, ; 260: System.Runtime.Intrinsics
	%struct.CompressedAssemblyDescriptor {
		i32 16176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47701792; uint32_t buffer_offset
	}, ; 261: System.Runtime.Loader
	%struct.CompressedAssemblyDescriptor {
		i32 145672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47717968; uint32_t buffer_offset
	}, ; 262: System.Runtime.Numerics
	%struct.CompressedAssemblyDescriptor {
		i32 66320, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47863640; uint32_t buffer_offset
	}, ; 263: System.Runtime.Serialization.Formatters
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47929960; uint32_t buffer_offset
	}, ; 264: System.Runtime.Serialization.Json
	%struct.CompressedAssemblyDescriptor {
		i32 23816, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47946104; uint32_t buffer_offset
	}, ; 265: System.Runtime.Serialization.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 17168, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47969920; uint32_t buffer_offset
	}, ; 266: System.Runtime.Serialization.Xml
	%struct.CompressedAssemblyDescriptor {
		i32 17672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 47987088; uint32_t buffer_offset
	}, ; 267: System.Runtime.Serialization
	%struct.CompressedAssemblyDescriptor {
		i32 45360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48004760; uint32_t buffer_offset
	}, ; 268: System.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 58640, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48050120; uint32_t buffer_offset
	}, ; 269: System.Security.AccessControl
	%struct.CompressedAssemblyDescriptor {
		i32 55560, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48108760; uint32_t buffer_offset
	}, ; 270: System.Security.Claims
	%struct.CompressedAssemblyDescriptor {
		i32 17680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48164320; uint32_t buffer_offset
	}, ; 271: System.Security.Cryptography.Algorithms
	%struct.CompressedAssemblyDescriptor {
		i32 16656, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48182000; uint32_t buffer_offset
	}, ; 272: System.Security.Cryptography.Cng
	%struct.CompressedAssemblyDescriptor {
		i32 16656, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48198656; uint32_t buffer_offset
	}, ; 273: System.Security.Cryptography.Csp
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48215312; uint32_t buffer_offset
	}, ; 274: System.Security.Cryptography.Encoding
	%struct.CompressedAssemblyDescriptor {
		i32 16184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48231456; uint32_t buffer_offset
	}, ; 275: System.Security.Cryptography.OpenSsl
	%struct.CompressedAssemblyDescriptor {
		i32 16176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48247640; uint32_t buffer_offset
	}, ; 276: System.Security.Cryptography.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 17168, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48263816; uint32_t buffer_offset
	}, ; 277: System.Security.Cryptography.X509Certificates
	%struct.CompressedAssemblyDescriptor {
		i32 851728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 48280984; uint32_t buffer_offset
	}, ; 278: System.Security.Cryptography
	%struct.CompressedAssemblyDescriptor {
		i32 38160, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49132712; uint32_t buffer_offset
	}, ; 279: System.Security.Principal.Windows
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49170872; uint32_t buffer_offset
	}, ; 280: System.Security.Principal
	%struct.CompressedAssemblyDescriptor {
		i32 16176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49186496; uint32_t buffer_offset
	}, ; 281: System.Security.SecureString
	%struct.CompressedAssemblyDescriptor {
		i32 18704, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49202672; uint32_t buffer_offset
	}, ; 282: System.Security
	%struct.CompressedAssemblyDescriptor {
		i32 17168, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49221376; uint32_t buffer_offset
	}, ; 283: System.ServiceModel.Web
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49238544; uint32_t buffer_offset
	}, ; 284: System.ServiceProcess
	%struct.CompressedAssemblyDescriptor {
		i32 743184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49254688; uint32_t buffer_offset
	}, ; 285: System.Text.Encoding.CodePages
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 49997872; uint32_t buffer_offset
	}, ; 286: System.Text.Encoding.Extensions
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 50014016; uint32_t buffer_offset
	}, ; 287: System.Text.Encoding
	%struct.CompressedAssemblyDescriptor {
		i32 66312, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 50030160; uint32_t buffer_offset
	}, ; 288: System.Text.Encodings.Web
	%struct.CompressedAssemblyDescriptor {
		i32 649480, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 50096472; uint32_t buffer_offset
	}, ; 289: System.Text.Json
	%struct.CompressedAssemblyDescriptor {
		i32 385288, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 50745952; uint32_t buffer_offset
	}, ; 290: System.Text.RegularExpressions
	%struct.CompressedAssemblyDescriptor {
		i32 34064, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51131240; uint32_t buffer_offset
	}, ; 291: System.Threading.AccessControl
	%struct.CompressedAssemblyDescriptor {
		i32 66872, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51165304; uint32_t buffer_offset
	}, ; 292: System.Threading.Channels
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51232176; uint32_t buffer_offset
	}, ; 293: System.Threading.Overlapped
	%struct.CompressedAssemblyDescriptor {
		i32 186128, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51248320; uint32_t buffer_offset
	}, ; 294: System.Threading.Tasks.Dataflow
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51434448; uint32_t buffer_offset
	}, ; 295: System.Threading.Tasks.Extensions
	%struct.CompressedAssemblyDescriptor {
		i32 61752, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51450592; uint32_t buffer_offset
	}, ; 296: System.Threading.Tasks.Parallel
	%struct.CompressedAssemblyDescriptor {
		i32 17168, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51512344; uint32_t buffer_offset
	}, ; 297: System.Threading.Tasks
	%struct.CompressedAssemblyDescriptor {
		i32 16136, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51529512; uint32_t buffer_offset
	}, ; 298: System.Threading.Thread
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51545648; uint32_t buffer_offset
	}, ; 299: System.Threading.ThreadPool
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51561792; uint32_t buffer_offset
	}, ; 300: System.Threading.Timer
	%struct.CompressedAssemblyDescriptor {
		i32 45368, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51577424; uint32_t buffer_offset
	}, ; 301: System.Threading
	%struct.CompressedAssemblyDescriptor {
		i32 176400, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51622792; uint32_t buffer_offset
	}, ; 302: System.Transactions.Local
	%struct.CompressedAssemblyDescriptor {
		i32 17208, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51799192; uint32_t buffer_offset
	}, ; 303: System.Transactions
	%struct.CompressedAssemblyDescriptor {
		i32 16184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51816400; uint32_t buffer_offset
	}, ; 304: System.ValueTuple
	%struct.CompressedAssemblyDescriptor {
		i32 30480, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51832584; uint32_t buffer_offset
	}, ; 305: System.Web.HttpUtility
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51863064; uint32_t buffer_offset
	}, ; 306: System.Web
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51878696; uint32_t buffer_offset
	}, ; 307: System.Windows
	%struct.CompressedAssemblyDescriptor {
		i32 16184, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51894840; uint32_t buffer_offset
	}, ; 308: System.Xml.Linq
	%struct.CompressedAssemblyDescriptor {
		i32 22288, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51911024; uint32_t buffer_offset
	}, ; 309: System.Xml.ReaderWriter
	%struct.CompressedAssemblyDescriptor {
		i32 16696, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51933312; uint32_t buffer_offset
	}, ; 310: System.Xml.Serialization
	%struct.CompressedAssemblyDescriptor {
		i32 16136, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51950008; uint32_t buffer_offset
	}, ; 311: System.Xml.XDocument
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51966144; uint32_t buffer_offset
	}, ; 312: System.Xml.XPath.XDocument
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51982288; uint32_t buffer_offset
	}, ; 313: System.Xml.XPath
	%struct.CompressedAssemblyDescriptor {
		i32 16144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 51998432; uint32_t buffer_offset
	}, ; 314: System.Xml.XmlDocument
	%struct.CompressedAssemblyDescriptor {
		i32 18232, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52014576; uint32_t buffer_offset
	}, ; 315: System.Xml.XmlSerializer
	%struct.CompressedAssemblyDescriptor {
		i32 23824, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52032808; uint32_t buffer_offset
	}, ; 316: System.Xml
	%struct.CompressedAssemblyDescriptor {
		i32 50960, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52056632; uint32_t buffer_offset
	}, ; 317: System
	%struct.CompressedAssemblyDescriptor {
		i32 16656, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52107592; uint32_t buffer_offset
	}, ; 318: WindowsBase
	%struct.CompressedAssemblyDescriptor {
		i32 60208, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52124248; uint32_t buffer_offset
	}, ; 319: mscorlib
	%struct.CompressedAssemblyDescriptor {
		i32 101176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52184456; uint32_t buffer_offset
	}, ; 320: netstandard
	%struct.CompressedAssemblyDescriptor {
		i32 244768, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52285632; uint32_t buffer_offset
	}, ; 321: Java.Interop
	%struct.CompressedAssemblyDescriptor {
		i32 83528, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52530400; uint32_t buffer_offset
	}, ; 322: Mono.Android.Export
	%struct.CompressedAssemblyDescriptor {
		i32 22560, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52613928; uint32_t buffer_offset
	}, ; 323: Mono.Android.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 41460224, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 52636488; uint32_t buffer_offset
	}, ; 324: Mono.Android
	%struct.CompressedAssemblyDescriptor {
		i32 55840, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 94096712; uint32_t buffer_offset
	}, ; 325: System.IO.Hashing
	%struct.CompressedAssemblyDescriptor {
		i32 4964656, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 94152552; uint32_t buffer_offset
	} ; 326: System.Private.CoreLib
], align 16

@uncompressed_assemblies_data_size = dso_local local_unnamed_addr constant i32 99117208, align 4

@uncompressed_assemblies_data_buffer = dso_local local_unnamed_addr global [99117208 x i8] zeroinitializer, align 16

; Metadata
!llvm.module.flags = !{!0, !1}
!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{i32 7, !"PIC Level", i32 2}
!llvm.ident = !{!2}
!2 = !{!".NET for Android remotes/origin/release/10.0.1xx @ 9a2d211ba972d3a0c4c108e043def432f3ec2620"}
!3 = !{!4, !4, i64 0}
!4 = !{!"any pointer", !5, i64 0}
!5 = !{!"omnipotent char", !6, i64 0}
!6 = !{!"Simple C++ TBAA"}
