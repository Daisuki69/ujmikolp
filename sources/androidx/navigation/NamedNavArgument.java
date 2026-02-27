package androidx.navigation;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NamedNavArgument {
    private final NavArgument argument;
    private final String name;

    public NamedNavArgument(String name, NavArgument argument) {
        j.g(name, "name");
        j.g(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    public final String component1() {
        return this.name;
    }

    public final NavArgument component2() {
        return this.argument;
    }

    public final NavArgument getArgument() {
        return this.argument;
    }

    public final String getName() {
        return this.name;
    }
}
