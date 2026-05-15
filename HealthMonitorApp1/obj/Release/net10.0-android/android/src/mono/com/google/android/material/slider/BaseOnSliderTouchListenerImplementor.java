package mono.com.google.android.material.slider;


public class BaseOnSliderTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.slider.BaseOnSliderTouchListener
{

	public BaseOnSliderTouchListenerImplementor ()
	{
		super ();
		if (getClass () == BaseOnSliderTouchListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Slider.IBaseOnSliderTouchListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onStartTrackingTouch (java.lang.Object p0)
	{
		n_onStartTrackingTouch (p0);
	}

	private native void n_onStartTrackingTouch (java.lang.Object p0);

	public void onStopTrackingTouch (java.lang.Object p0)
	{
		n_onStopTrackingTouch (p0);
	}

	private native void n_onStopTrackingTouch (java.lang.Object p0);

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
