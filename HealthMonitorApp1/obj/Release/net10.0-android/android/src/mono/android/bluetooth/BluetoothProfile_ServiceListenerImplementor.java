package mono.android.bluetooth;


public class BluetoothProfile_ServiceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.bluetooth.BluetoothProfile.ServiceListener
{

	public BluetoothProfile_ServiceListenerImplementor ()
	{
		super ();
		if (getClass () == BluetoothProfile_ServiceListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Bluetooth.IBluetoothProfileServiceListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onServiceConnected (int p0, android.bluetooth.BluetoothProfile p1)
	{
		n_onServiceConnected (p0, p1);
	}

	private native void n_onServiceConnected (int p0, android.bluetooth.BluetoothProfile p1);

	public void onServiceDisconnected (int p0)
	{
		n_onServiceDisconnected (p0);
	}

	private native void n_onServiceDisconnected (int p0);

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
