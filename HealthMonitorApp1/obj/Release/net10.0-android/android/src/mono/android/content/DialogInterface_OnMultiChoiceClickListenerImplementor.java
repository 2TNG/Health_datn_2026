package mono.android.content;


public class DialogInterface_OnMultiChoiceClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnMultiChoiceClickListener
{

	public DialogInterface_OnMultiChoiceClickListenerImplementor ()
	{
		super ();
		if (getClass () == DialogInterface_OnMultiChoiceClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.IDialogInterfaceOnMultiChoiceClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClick (android.content.DialogInterface p0, int p1, boolean p2)
	{
		n_onClick (p0, p1, p2);
	}

	private native void n_onClick (android.content.DialogInterface p0, int p1, boolean p2);

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
