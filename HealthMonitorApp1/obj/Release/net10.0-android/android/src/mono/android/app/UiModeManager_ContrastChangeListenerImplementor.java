package mono.android.app;


public class UiModeManager_ContrastChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.UiModeManager.ContrastChangeListener
{

	public UiModeManager_ContrastChangeListenerImplementor ()
	{
		super ();
		if (getClass () == UiModeManager_ContrastChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.UiModeManager+IContrastChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onContrastChanged (float p0)
	{
		n_onContrastChanged (p0);
	}

	private native void n_onContrastChanged (float p0);

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
