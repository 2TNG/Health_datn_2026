package mono.android.view;


public class AttachedSurfaceControl_OnBufferTransformHintChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener
{

	public AttachedSurfaceControl_OnBufferTransformHintChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AttachedSurfaceControl_OnBufferTransformHintChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.IAttachedSurfaceControl+IOnBufferTransformHintChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBufferTransformHintChanged (int p0)
	{
		n_onBufferTransformHintChanged (p0);
	}

	private native void n_onBufferTransformHintChanged (int p0);

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
