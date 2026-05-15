package mono.android.content;


public class ClipboardManager_OnPrimaryClipChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.ClipboardManager.OnPrimaryClipChangedListener
{

	public ClipboardManager_OnPrimaryClipChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ClipboardManager_OnPrimaryClipChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.ClipboardManager+IOnPrimaryClipChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPrimaryClipChanged ()
	{
		n_onPrimaryClipChanged ();
	}

	private native void n_onPrimaryClipChanged ();

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
