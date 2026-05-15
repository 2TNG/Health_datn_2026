package mono.android.media;


public class JetPlayer_OnJetEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.JetPlayer.OnJetEventListener
{

	public JetPlayer_OnJetEventListenerImplementor ()
	{
		super ();
		if (getClass () == JetPlayer_OnJetEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.JetPlayer+IOnJetEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onJetEvent (android.media.JetPlayer p0, short p1, byte p2, byte p3, byte p4, byte p5)
	{
		n_onJetEvent (p0, p1, p2, p3, p4, p5);
	}

	private native void n_onJetEvent (android.media.JetPlayer p0, short p1, byte p2, byte p3, byte p4, byte p5);

	public void onJetNumQueuedSegmentUpdate (android.media.JetPlayer p0, int p1)
	{
		n_onJetNumQueuedSegmentUpdate (p0, p1);
	}

	private native void n_onJetNumQueuedSegmentUpdate (android.media.JetPlayer p0, int p1);

	public void onJetPauseUpdate (android.media.JetPlayer p0, int p1)
	{
		n_onJetPauseUpdate (p0, p1);
	}

	private native void n_onJetPauseUpdate (android.media.JetPlayer p0, int p1);

	public void onJetUserIdUpdate (android.media.JetPlayer p0, int p1, int p2)
	{
		n_onJetUserIdUpdate (p0, p1, p2);
	}

	private native void n_onJetUserIdUpdate (android.media.JetPlayer p0, int p1, int p2);

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
