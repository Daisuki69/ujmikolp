package mx_android.support.v4.media.routing;

import android.media.MediaRouter;

/* JADX INFO: loaded from: classes7.dex */
class MediaRouterJellybeanMr2 extends MediaRouterJellybeanMr1 {
    MediaRouterJellybeanMr2() {
    }

    public static Object getDefaultRoute(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }

    public static void addCallback(Object obj, int i, Object obj2, int i4) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i4);
    }

    public static final class RouteInfo {
        public static CharSequence getDescription(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean isConnecting(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    public static final class UserRouteInfo {
        public static void setDescription(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }
}
