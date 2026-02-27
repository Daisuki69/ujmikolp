package C2;

import We.s;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import defpackage.AbstractC1414e;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements B2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f671b;

    public /* synthetic */ b(Object obj, int i) {
        this.f670a = i;
        this.f671b = obj;
    }

    @Override // B2.b
    public final Object get() {
        switch (this.f670a) {
            case 0:
                return new D2.c((U1.g) this.f671b);
            case 1:
                String str = (String) this.f671b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(s.j("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new InvalidRegistrarException(s.j("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new InvalidRegistrarException(AbstractC1414e.h("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new InvalidRegistrarException(AbstractC1414e.h("Could not instantiate ", str), e11);
                }
            default:
                return (ComponentRegistrar) this.f671b;
        }
    }
}
