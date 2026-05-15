package mono.androidx.core.view;


public class DragStartHelper_OnDragStartListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.view.DragStartHelper.OnDragStartListener
{

	public DragStartHelper_OnDragStartListenerImplementor ()
	{
		super ();
		if (getClass () == DragStartHelper_OnDragStartListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.View.DragStartHelper+IOnDragStartListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onDragStart (android.view.View p0, androidx.core.view.DragStartHelper p1)
	{
		return n_onDragStart (p0, p1);
	}

	private native boolean n_onDragStart (android.view.View p0, androidx.core.view.DragStartHelper p1);

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
