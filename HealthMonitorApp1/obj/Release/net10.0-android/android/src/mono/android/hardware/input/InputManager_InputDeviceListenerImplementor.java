package mono.android.hardware.input;


public class InputManager_InputDeviceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.hardware.input.InputManager.InputDeviceListener
{

	public InputManager_InputDeviceListenerImplementor ()
	{
		super ();
		if (getClass () == InputManager_InputDeviceListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Hardware.Input.InputManager+IInputDeviceListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onInputDeviceAdded (int p0)
	{
		n_onInputDeviceAdded (p0);
	}

	private native void n_onInputDeviceAdded (int p0);

	public void onInputDeviceChanged (int p0)
	{
		n_onInputDeviceChanged (p0);
	}

	private native void n_onInputDeviceChanged (int p0);

	public void onInputDeviceRemoved (int p0)
	{
		n_onInputDeviceRemoved (p0);
	}

	private native void n_onInputDeviceRemoved (int p0);

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
