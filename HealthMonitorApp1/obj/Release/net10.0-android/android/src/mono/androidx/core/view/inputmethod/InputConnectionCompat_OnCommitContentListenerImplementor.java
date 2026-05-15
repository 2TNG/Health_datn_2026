package mono.androidx.core.view.inputmethod;


public class InputConnectionCompat_OnCommitContentListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
{

	public InputConnectionCompat_OnCommitContentListenerImplementor ()
	{
		super ();
		if (getClass () == InputConnectionCompat_OnCommitContentListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.View.InputMethod.InputConnectionCompat+IOnCommitContentListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onCommitContent (androidx.core.view.inputmethod.InputContentInfoCompat p0, int p1, android.os.Bundle p2)
	{
		return n_onCommitContent (p0, p1, p2);
	}

	private native boolean n_onCommitContent (androidx.core.view.inputmethod.InputContentInfoCompat p0, int p1, android.os.Bundle p2);

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
