package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import cj.C1110A;
import cj.C1129o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import rj.InterfaceC2210a;
import yj.C2536a;
import yj.n;
import yj.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, InterfaceC2210a {
    public static final Companion Companion = new Companion(null);
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NavDestination findStartDestination(NavGraph navGraph) {
            j.g(navGraph, "<this>");
            return (NavDestination) q.m(n.e(NavGraph$Companion$findStartDestination$1.INSTANCE, navGraph.findNode(navGraph.getStartDestinationId())));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraph$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<NavDestination>, InterfaceC2210a {
        private int index = -1;
        private boolean wentToNext;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < NavGraph.this.getNodes().size();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            SparseArrayCompat<NavDestination> nodes = NavGraph.this.getNodes();
            nodes.valueAt(this.index).setParent(null);
            nodes.removeAt(this.index);
            this.index--;
            this.wentToNext = false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.wentToNext = true;
            SparseArrayCompat<NavDestination> nodes = NavGraph.this.getNodes();
            int i = this.index + 1;
            this.index = i;
            NavDestination navDestinationValueAt = nodes.valueAt(i);
            j.f(navDestinationValueAt, "nodes.valueAt(++index)");
            return navDestinationValueAt;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        j.g(navGraphNavigator, "navGraphNavigator");
        this.nodes = new SparseArrayCompat<>();
    }

    public static final NavDestination findStartDestination(NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i) {
        if (i != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    private final void setStartDestinationRoute(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(getRoute())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (C2576A.H(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = NavDestination.Companion.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final void addAll(NavGraph other) {
        j.g(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination(next);
        }
    }

    public final void addDestination(NavDestination node) {
        j.g(node, "node");
        int id = node.getId();
        String route = node.getRoute();
        if (id == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getRoute() != null && j.b(route, getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id == getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestination = this.nodes.get(id);
        if (navDestination == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination != null) {
            navDestination.setParent(null);
        }
        node.setParent(this);
        this.nodes.put(node.getId(), node);
    }

    public final void addDestinations(Collection<? extends NavDestination> nodes) {
        j.g(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        Sequence sequenceB = n.b(SparseArrayKt.valueIterator(this.nodes));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C2536a) sequenceB).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        NavGraph navGraph = (NavGraph) obj;
        Iterator itValueIterator = SparseArrayKt.valueIterator(navGraph.nodes);
        while (itValueIterator.hasNext()) {
            arrayList.remove((NavDestination) itValueIterator.next());
        }
        return super.equals(obj) && this.nodes.size() == navGraph.nodes.size() && getStartDestinationId() == navGraph.getStartDestinationId() && arrayList.isEmpty();
    }

    public final NavDestination findNode(@IdRes int i) {
        return findNode(i, true);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        return getId() != 0 ? super.getDisplayName() : "the root navigation";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        j.d(str);
        return str;
    }

    @IdRes
    public final int getStartDestination() {
        return getStartDestinationId();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.startDestId;
    }

    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = (((startDestinationId * 31) + sparseArrayCompat.keyAt(i)) * 31) + sparseArrayCompat.valueAt(i).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new AnonymousClass1();
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        j.g(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink2 = it.next().matchDeepLink(navDeepLinkRequest);
            if (deepLinkMatchMatchDeepLink2 != null) {
                arrayList.add(deepLinkMatchMatchDeepLink2);
            }
        }
        return (NavDestination.DeepLinkMatch) C1110A.I(C1129o.q(new NavDestination.DeepLinkMatch[]{deepLinkMatchMatchDeepLink, (NavDestination.DeepLinkMatch) C1110A.I(arrayList)}));
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(Context context, AttributeSet attrs) {
        j.g(context, "context");
        j.g(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavGraphNavigator);
        j.f(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.Companion.getDisplayName(context, this.startDestId);
        Unit unit = Unit.f18162a;
        typedArrayObtainAttributes.recycle();
    }

    public final void remove(NavDestination node) {
        j.g(node, "node");
        int iIndexOfKey = this.nodes.indexOfKey(node.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void setStartDestination(int i) {
        setStartDestinationId(i);
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        NavDestination navDestinationFindNode = findNode(this.startDestinationRoute);
        if (navDestinationFindNode == null) {
            navDestinationFindNode = findNode(getStartDestinationId());
        }
        sb2.append(" startDestination=");
        if (navDestinationFindNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(navDestinationFindNode.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        j.f(string, "sb.toString()");
        return string;
    }

    public final NavDestination findNode(String str) {
        if (str == null || C2576A.H(str)) {
            return null;
        }
        return findNode(str, true);
    }

    public final void setStartDestination(String startDestRoute) {
        j.g(startDestRoute, "startDestRoute");
        setStartDestinationRoute(startDestRoute);
    }

    public final void addDestinations(NavDestination... nodes) {
        j.g(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(@IdRes int i, boolean z4) {
        NavDestination navDestination = this.nodes.get(i);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z4 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        j.d(parent);
        return parent.findNode(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(String route, boolean z4) {
        j.g(route, "route");
        NavDestination navDestination = this.nodes.get(NavDestination.Companion.createRoute(route).hashCode());
        if (navDestination != null) {
            return navDestination;
        }
        if (!z4 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        j.d(parent);
        return parent.findNode(route);
    }
}
