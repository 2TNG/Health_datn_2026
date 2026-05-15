package mono.android.media.tv;


public class TvView_OnUnhandledInputEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.tv.TvView.OnUnhandledInputEventListener
{

	public TvView_OnUnhandledInputEventListenerImplementor ()
	{
		super ();
		if (getClass () == TvView_OnUnhandledInputEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.TV.TvView+IOnUnhandledInputEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onUnhandledInputEvent (android.view.InputEvent p0)
	{
		return n_onUnhandledInputEvent (p0);
	}

	private native boolean n_onUnhandledInputEvent (android.view.InputEvent p0);

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
