package android.runtime;


public class JavaProxyThrowable
	extends java.lang.Error
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Android.Runtime.JavaProxyThrowable, Mono.Android", JavaProxyThrowable.class, __md_methods);
	}

	public JavaProxyThrowable ()
	{
		super ();
		if (getClass () == JavaProxyThrowable.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaProxyThrowable, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public JavaProxyThrowable (java.lang.String p0, java.lang.Throwable p1, boolean p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == JavaProxyThrowable.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaProxyThrowable, Mono.Android", "System.String, System.Private.CoreLib:Java.Lang.Throwable, Mono.Android:System.Boolean, System.Private.CoreLib:System.Boolean, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public JavaProxyThrowable (java.lang.String p0, java.lang.Throwable p1)
	{
		super (p0, p1);
		if (getClass () == JavaProxyThrowable.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaProxyThrowable, Mono.Android", "System.String, System.Private.CoreLib:Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public JavaProxyThrowable (java.lang.String p0)
	{
		super (p0);
		if (getClass () == JavaProxyThrowable.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaProxyThrowable, Mono.Android", "System.String, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}

	public JavaProxyThrowable (java.lang.Throwable p0)
	{
		super (p0);
		if (getClass () == JavaProxyThrowable.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaProxyThrowable, Mono.Android", "Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0 });
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
