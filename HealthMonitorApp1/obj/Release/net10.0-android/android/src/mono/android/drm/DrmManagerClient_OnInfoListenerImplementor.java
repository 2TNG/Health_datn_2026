package mono.android.drm;


public class DrmManagerClient_OnInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.drm.DrmManagerClient.OnInfoListener
{

	public DrmManagerClient_OnInfoListenerImplementor ()
	{
		super ();
		if (getClass () == DrmManagerClient_OnInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Drm.DrmManagerClient+IOnInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onInfo (android.drm.DrmManagerClient p0, android.drm.DrmInfoEvent p1)
	{
		n_onInfo (p0, p1);
	}

	private native void n_onInfo (android.drm.DrmManagerClient p0, android.drm.DrmInfoEvent p1);

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
