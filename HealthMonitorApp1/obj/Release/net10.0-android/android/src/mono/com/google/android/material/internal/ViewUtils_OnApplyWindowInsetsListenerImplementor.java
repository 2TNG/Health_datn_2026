package mono.com.google.android.material.internal;


public class ViewUtils_OnApplyWindowInsetsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
{

	public ViewUtils_OnApplyWindowInsetsListenerImplementor ()
	{
		super ();
		if (getClass () == ViewUtils_OnApplyWindowInsetsListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Internal.ViewUtils+IOnApplyWindowInsetsListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public androidx.core.view.WindowInsetsCompat onApplyWindowInsets (android.view.View p0, androidx.core.view.WindowInsetsCompat p1, com.google.android.material.internal.ViewUtils.RelativePadding p2)
	{
		return n_onApplyWindowInsets (p0, p1, p2);
	}

	private native androidx.core.view.WindowInsetsCompat n_onApplyWindowInsets (android.view.View p0, androidx.core.view.WindowInsetsCompat p1, com.google.android.material.internal.ViewUtils.RelativePadding p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
