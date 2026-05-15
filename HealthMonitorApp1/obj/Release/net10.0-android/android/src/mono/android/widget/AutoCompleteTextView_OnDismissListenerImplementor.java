package mono.android.widget;


public class AutoCompleteTextView_OnDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AutoCompleteTextView.OnDismissListener
{

	public AutoCompleteTextView_OnDismissListenerImplementor ()
	{
		super ();
		if (getClass () == AutoCompleteTextView_OnDismissListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.AutoCompleteTextView+IOnDismissListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();

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
