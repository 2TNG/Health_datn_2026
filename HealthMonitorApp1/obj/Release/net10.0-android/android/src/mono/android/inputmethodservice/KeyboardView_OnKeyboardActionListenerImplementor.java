package mono.android.inputmethodservice;


public class KeyboardView_OnKeyboardActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.inputmethodservice.KeyboardView.OnKeyboardActionListener
{

	public KeyboardView_OnKeyboardActionListenerImplementor ()
	{
		super ();
		if (getClass () == KeyboardView_OnKeyboardActionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.InputMethodServices.KeyboardView+IOnKeyboardActionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onKey (int p0, int[] p1)
	{
		n_onKey (p0, p1);
	}

	private native void n_onKey (int p0, int[] p1);

	public void onPress (int p0)
	{
		n_onPress (p0);
	}

	private native void n_onPress (int p0);

	public void onRelease (int p0)
	{
		n_onRelease (p0);
	}

	private native void n_onRelease (int p0);

	public void onText (java.lang.CharSequence p0)
	{
		n_onText (p0);
	}

	private native void n_onText (java.lang.CharSequence p0);

	public void swipeDown ()
	{
		n_swipeDown ();
	}

	private native void n_swipeDown ();

	public void swipeLeft ()
	{
		n_swipeLeft ();
	}

	private native void n_swipeLeft ();

	public void swipeRight ()
	{
		n_swipeRight ();
	}

	private native void n_swipeRight ();

	public void swipeUp ()
	{
		n_swipeUp ();
	}

	private native void n_swipeUp ();

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
