package mono.android.drm;


public class DrmManagerClient_OnEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.drm.DrmManagerClient.OnEventListener
{

	public DrmManagerClient_OnEventListenerImplementor ()
	{
		super ();
		if (getClass () == DrmManagerClient_OnEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Drm.DrmManagerClient+IOnEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEvent (android.drm.DrmManagerClient p0, android.drm.DrmEvent p1)
	{
		n_onEvent (p0, p1);
	}

	private native void n_onEvent (android.drm.DrmManagerClient p0, android.drm.DrmEvent p1);

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
