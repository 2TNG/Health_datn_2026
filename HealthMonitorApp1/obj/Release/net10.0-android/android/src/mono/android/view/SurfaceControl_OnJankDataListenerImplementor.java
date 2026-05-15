package mono.android.view;


public class SurfaceControl_OnJankDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.SurfaceControl.OnJankDataListener
{

	public SurfaceControl_OnJankDataListenerImplementor ()
	{
		super ();
		if (getClass () == SurfaceControl_OnJankDataListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.SurfaceControl+IOnJankDataListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onJankDataAvailable (java.util.List p0)
	{
		n_onJankDataAvailable (p0);
	}

	private native void n_onJankDataAvailable (java.util.List p0);

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
