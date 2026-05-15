package mono.android.app;


public class AlarmManager_OnAlarmListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.AlarmManager.OnAlarmListener
{

	public AlarmManager_OnAlarmListenerImplementor ()
	{
		super ();
		if (getClass () == AlarmManager_OnAlarmListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.AlarmManager+IOnAlarmListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAlarm ()
	{
		n_onAlarm ();
	}

	private native void n_onAlarm ();

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
