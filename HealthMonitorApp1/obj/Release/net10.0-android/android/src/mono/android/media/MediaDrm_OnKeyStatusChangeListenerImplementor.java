package mono.android.media;


public class MediaDrm_OnKeyStatusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaDrm.OnKeyStatusChangeListener
{

	public MediaDrm_OnKeyStatusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == MediaDrm_OnKeyStatusChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaDrm+IOnKeyStatusChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onKeyStatusChange (android.media.MediaDrm p0, byte[] p1, java.util.List p2, boolean p3)
	{
		n_onKeyStatusChange (p0, p1, p2, p3);
	}

	private native void n_onKeyStatusChange (android.media.MediaDrm p0, byte[] p1, java.util.List p2, boolean p3);

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
