package mono.android.os;


public class ParcelFileDescriptor_OnCloseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.ParcelFileDescriptor.OnCloseListener
{

	public ParcelFileDescriptor_OnCloseListenerImplementor ()
	{
		super ();
		if (getClass () == ParcelFileDescriptor_OnCloseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.ParcelFileDescriptor+IOnCloseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClose (java.io.IOException p0)
	{
		n_onClose (p0);
	}

	private native void n_onClose (java.io.IOException p0);

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
