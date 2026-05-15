package mono.android.os;


public class MessageQueue_OnFileDescriptorEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.MessageQueue.OnFileDescriptorEventListener
{

	public MessageQueue_OnFileDescriptorEventListenerImplementor ()
	{
		super ();
		if (getClass () == MessageQueue_OnFileDescriptorEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.MessageQueue+IOnFileDescriptorEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public int onFileDescriptorEvents (java.io.FileDescriptor p0, int p1)
	{
		return n_onFileDescriptorEvents (p0, p1);
	}

	private native int n_onFileDescriptorEvents (java.io.FileDescriptor p0, int p1);

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
