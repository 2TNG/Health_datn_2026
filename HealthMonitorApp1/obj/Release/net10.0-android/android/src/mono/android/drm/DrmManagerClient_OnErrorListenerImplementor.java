package mono.android.drm;


public class DrmManagerClient_OnErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.drm.DrmManagerClient.OnErrorListener
{

	public DrmManagerClient_OnErrorListenerImplementor ()
	{
		super ();
		if (getClass () == DrmManagerClient_OnErrorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Drm.DrmManagerClient+IOnErrorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onError (android.drm.DrmManagerClient p0, android.drm.DrmErrorEvent p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (android.drm.DrmManagerClient p0, android.drm.DrmErrorEvent p1);

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
