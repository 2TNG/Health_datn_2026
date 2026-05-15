package mono.android.view;


public class ViewStub_OnInflateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewStub.OnInflateListener
{

	public ViewStub_OnInflateListenerImplementor ()
	{
		super ();
		if (getClass () == ViewStub_OnInflateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewStub+IOnInflateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onInflate (android.view.ViewStub p0, android.view.View p1)
	{
		n_onInflate (p0, p1);
	}

	private native void n_onInflate (android.view.ViewStub p0, android.view.View p1);

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
