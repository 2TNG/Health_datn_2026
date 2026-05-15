package mono.androidx.recyclerview.widget;


public class RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
{

	public RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.RecyclerView.Widget.RecyclerView+ItemAnimator+IItemAnimatorFinishedListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationsFinished ()
	{
		n_onAnimationsFinished ();
	}

	private native void n_onAnimationsFinished ();

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
