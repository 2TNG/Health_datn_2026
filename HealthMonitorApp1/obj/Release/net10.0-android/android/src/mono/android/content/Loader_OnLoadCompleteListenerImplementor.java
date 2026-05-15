package mono.android.content;


public class Loader_OnLoadCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.Loader.OnLoadCompleteListener
{

	public Loader_OnLoadCompleteListenerImplementor ()
	{
		super ();
		if (getClass () == Loader_OnLoadCompleteListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.Loader+IOnLoadCompleteListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onLoadComplete (android.content.Loader p0, java.lang.Object p1)
	{
		n_onLoadComplete (p0, p1);
	}

	private native void n_onLoadComplete (android.content.Loader p0, java.lang.Object p1);

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
