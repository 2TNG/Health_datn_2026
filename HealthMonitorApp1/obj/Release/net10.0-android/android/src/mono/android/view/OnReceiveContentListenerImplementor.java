package mono.android.view;


public class OnReceiveContentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.OnReceiveContentListener
{

	public OnReceiveContentListenerImplementor ()
	{
		super ();
		if (getClass () == OnReceiveContentListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.IOnReceiveContentListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public android.view.ContentInfo onReceiveContent (android.view.View p0, android.view.ContentInfo p1)
	{
		return n_onReceiveContent (p0, p1);
	}

	private native android.view.ContentInfo n_onReceiveContent (android.view.View p0, android.view.ContentInfo p1);

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
