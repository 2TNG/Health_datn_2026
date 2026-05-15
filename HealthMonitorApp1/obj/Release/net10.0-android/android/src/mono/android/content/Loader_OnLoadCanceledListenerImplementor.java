package mono.android.content;


public class Loader_OnLoadCanceledListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.Loader.OnLoadCanceledListener
{

	public Loader_OnLoadCanceledListenerImplementor ()
	{
		super ();
		if (getClass () == Loader_OnLoadCanceledListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.Loader+IOnLoadCanceledListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onLoadCanceled (android.content.Loader p0)
	{
		n_onLoadCanceled (p0);
	}

	private native void n_onLoadCanceled (android.content.Loader p0);

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
