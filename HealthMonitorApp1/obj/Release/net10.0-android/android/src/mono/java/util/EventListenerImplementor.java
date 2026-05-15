package mono.java.util;


public class EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.util.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Java.Util.IEventListenerImplementor, Mono.Android", EventListenerImplementor.class, __md_methods);
	}

	public EventListenerImplementor ()
	{
		super ();
		if (getClass () == EventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Java.Util.IEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

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
