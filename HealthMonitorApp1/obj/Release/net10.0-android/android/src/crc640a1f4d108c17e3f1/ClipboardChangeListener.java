package crc640a1f4d108c17e3f1;


public class ClipboardChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.ClipboardManager.OnPrimaryClipChangedListener
{

	public ClipboardChangeListener ()
	{
		super ();
		if (getClass () == ClipboardChangeListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.ApplicationModel.DataTransfer.ClipboardChangeListener, Microsoft.Maui.Essentials", "", this, new java.lang.Object[] {  });
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
