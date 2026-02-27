package ok;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import qk.f;
import qk.g;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f18906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qk.d f18907b = new qk.d(1);
    public static final qk.d c = new qk.d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f18908d;
    public static volatile qk.d e;
    public static final String[] f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f18908d = property == null ? false : property.equalsIgnoreCase("true");
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        qk.d dVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = qk.e.f19812a;
                if (AbstractC2217b.c(2) >= AbstractC2217b.c(qk.e.f19813b)) {
                    qk.e.c().println("SLF4J(I): " + str);
                }
                dVar = (qk.d) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e7) {
                qk.e.b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e7);
            } catch (ClassNotFoundException e10) {
                e = e10;
                qk.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e11) {
                e = e11;
                qk.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e12) {
                e = e12;
                qk.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e13) {
                e = e13;
                qk.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                qk.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (dVar != null) {
            arrayList.add(dVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(qk.d.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: ok.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(qk.d.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((qk.d) it.next());
            } catch (ServiceConfigurationError e15) {
                qk.e.a("A service provider failed to instantiate:\n" + e15.getMessage());
            }
        }
        return arrayList;
    }

    public static qk.d b() {
        if (f18906a == 0) {
            synchronized (d.class) {
                try {
                    if (f18906a == 0) {
                        f18906a = 1;
                        c();
                    }
                } finally {
                }
            }
        }
        int i = f18906a;
        if (i == 1) {
            return f18907b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return e;
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static final void c() {
        try {
            ArrayList arrayListA = a();
            g(arrayListA);
            if (arrayListA.isEmpty()) {
                f18906a = 4;
                qk.e.d("No SLF4J providers were found.");
                qk.e.d("Defaulting to no-operation (NOP) logger implementation");
                qk.e.d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e7) {
                    qk.e.b("Error getting resources from path", e7);
                }
                f(linkedHashSet);
            } else {
                e = (qk.d) arrayListA.get(0);
                e.getClass();
                f18906a = 3;
                e(arrayListA);
            }
            d();
            if (f18906a == 3) {
                try {
                    switch (e.f19810a) {
                        case 0:
                            boolean z4 = false;
                            for (String str : f) {
                                if ("2.0.99".startsWith(str)) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                return;
                            }
                            qk.e.d("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                            qk.e.d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th2) {
                    qk.e.b("Unexpected problem occurred during version sanity check", th2);
                }
            }
        } catch (Exception e10) {
            f18906a = 2;
            qk.e.b("Failed to instantiate SLF4J LoggerFactory", e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    public static void d() {
        qk.d dVar = f18907b;
        synchronized (dVar) {
            try {
                ((g) dVar.f19811b).f19818a = true;
                g gVar = (g) dVar.f19811b;
                gVar.getClass();
                for (f fVar : new ArrayList(gVar.f19819b.values())) {
                    fVar.f19815b = b().a().a(fVar.f19814a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((g) f18907b.f19811b).c;
        int size = linkedBlockingQueue.size();
        ArrayList<pk.b> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (pk.b bVar : arrayList) {
                if (bVar != null) {
                    f fVar2 = bVar.f19714b;
                    String str = fVar2.f19814a;
                    if (fVar2.f19815b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(fVar2.f19815b instanceof qk.b)) {
                        if (!fVar2.j()) {
                            qk.e.d(str);
                        } else if (fVar2.h(bVar.f19713a) && fVar2.j()) {
                            try {
                                fVar2.f19816d.invoke(fVar2.f19815b, bVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i + 1;
                if (i == 0) {
                    if (bVar.f19714b.j()) {
                        qk.e.d("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        qk.e.d("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        qk.e.d("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.f19714b.f19815b instanceof qk.b)) {
                        qk.e.d("The following set of substitute loggers may have been accessed");
                        qk.e.d("during the initialization phase. Logging calls during this");
                        qk.e.d("phase were not honored. However, subsequent logging calls to these");
                        qk.e.d("loggers will work as normally expected.");
                        qk.e.d("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i4;
            }
            arrayList.clear();
        }
        g gVar2 = (g) f18907b.f19811b;
        gVar2.f19819b.clear();
        gVar2.c.clear();
    }

    public static void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = qk.e.f19812a;
            if (AbstractC2217b.c(2) >= AbstractC2217b.c(qk.e.f19813b)) {
                qk.e.c().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((qk.d) arrayList.get(0)).getClass().getName() + "]";
        int i4 = qk.e.f19812a;
        if (AbstractC2217b.c(1) >= AbstractC2217b.c(qk.e.f19813b)) {
            qk.e.c().println("SLF4J(D): " + str2);
        }
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        qk.e.d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            qk.e.d("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        qk.e.d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            qk.e.d("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qk.e.d("Found provider [" + ((qk.d) it.next()) + "]");
            }
            qk.e.d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
