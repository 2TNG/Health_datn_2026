package mono.androidx.core.os;


public class CancellationSignal_OnCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.os.CancellationSignal.OnCancelListener
{

	public CancellationSignal_OnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == CancellationSignal_OnCancelListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.OS.CancellationSignal+IOnCancelListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
