package mono.android.media;


public class SoundPool_OnLoadCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.SoundPool.OnLoadCompleteListener
{

	public SoundPool_OnLoadCompleteListenerImplementor ()
	{
		super ();
		if (getClass () == SoundPool_OnLoadCompleteListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.SoundPool+IOnLoadCompleteListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onLoadComplete (android.media.SoundPool p0, int p1, int p2)
	{
		n_onLoadComplete (p0, p1, p2);
	}

	private native void n_onLoadComplete (android.media.SoundPool p0, int p1, int p2);

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
