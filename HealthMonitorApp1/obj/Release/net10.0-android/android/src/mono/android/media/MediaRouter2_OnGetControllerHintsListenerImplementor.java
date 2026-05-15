package mono.android.media;


public class MediaRouter2_OnGetControllerHintsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaRouter2.OnGetControllerHintsListener
{

	public MediaRouter2_OnGetControllerHintsListenerImplementor ()
	{
		super ();
		if (getClass () == MediaRouter2_OnGetControllerHintsListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaRouter2+IOnGetControllerHintsListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public android.os.Bundle onGetControllerHints (android.media.MediaRoute2Info p0)
	{
		return n_onGetControllerHints (p0);
	}

	private native android.os.Bundle n_onGetControllerHints (android.media.MediaRoute2Info p0);

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
