package mono.android.media;


public class MediaCas_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaCas.EventListener
{

	public MediaCas_EventListenerImplementor ()
	{
		super ();
		if (getClass () == MediaCas_EventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaCas+IEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEvent (android.media.MediaCas p0, int p1, int p2, byte[] p3)
	{
		n_onEvent (p0, p1, p2, p3);
	}

	private native void n_onEvent (android.media.MediaCas p0, int p1, int p2, byte[] p3);

	public void onPluginStatusUpdate (android.media.MediaCas p0, int p1, int p2)
	{
		n_onPluginStatusUpdate (p0, p1, p2);
	}

	private native void n_onPluginStatusUpdate (android.media.MediaCas p0, int p1, int p2);

	public void onResourceLost (android.media.MediaCas p0)
	{
		n_onResourceLost (p0);
	}

	private native void n_onResourceLost (android.media.MediaCas p0);

	public void onSessionEvent (android.media.MediaCas p0, android.media.MediaCas.Session p1, int p2, int p3, byte[] p4)
	{
		n_onSessionEvent (p0, p1, p2, p3, p4);
	}

	private native void n_onSessionEvent (android.media.MediaCas p0, android.media.MediaCas.Session p1, int p2, int p3, byte[] p4);

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
