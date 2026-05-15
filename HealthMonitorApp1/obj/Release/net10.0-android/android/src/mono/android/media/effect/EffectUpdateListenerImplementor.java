package mono.android.media.effect;


public class EffectUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.effect.EffectUpdateListener
{

	public EffectUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == EffectUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Effect.IEffectUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEffectUpdated (android.media.effect.Effect p0, java.lang.Object p1)
	{
		n_onEffectUpdated (p0, p1);
	}

	private native void n_onEffectUpdated (android.media.effect.Effect p0, java.lang.Object p1);

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
