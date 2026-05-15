package mono.android.view;


public class View_OnDragListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnDragListener
{

	public View_OnDragListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnDragListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnDragListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onDrag (android.view.View p0, android.view.DragEvent p1)
	{
		return n_onDrag (p0, p1);
	}

	private native boolean n_onDrag (android.view.View p0, android.view.DragEvent p1);

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
