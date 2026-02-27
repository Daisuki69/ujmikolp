package mx_android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import mx_android.support.v4.app.NotificationCompatBase;
import mx_android.support.v4.app.RemoteInputCompatBase;

/* JADX INFO: loaded from: classes7.dex */
class NotificationCompatApi20 {
    NotificationCompatApi20() {
    }

    public static class Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Notification.Builder f18444b;
        private Bundle mExtras;

        public Builder(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i4, int i6, boolean z4, boolean z5, boolean z8, int i10, CharSequence charSequence4, boolean z9, ArrayList<String> arrayList, Bundle bundle, String str, boolean z10, String str2) {
            PendingIntent pendingIntent3;
            boolean z11 = true;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z5).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
            } else {
                pendingIntent3 = pendingIntent2;
                z11 = false;
            }
            this.f18444b = deleteIntent.setFullScreenIntent(pendingIntent3, z11).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z8).setPriority(i10).setProgress(i4, i6, z4).setLocalOnly(z9).setGroup(str).setGroupSummary(z10).setSortKey(str2);
            Bundle bundle2 = new Bundle();
            this.mExtras = bundle2;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            this.mExtras.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }

        @Override // mx_android.support.v4.app.NotificationBuilderWithActions
        public void addAction(NotificationCompatBase.Action action) {
            NotificationCompatApi20.addAction(this.f18444b, action);
        }

        @Override // mx_android.support.v4.app.NotificationBuilderWithBuilderAccessor
        public Notification.Builder getBuilder() {
            return this.f18444b;
        }

        public Notification build() {
            this.f18444b.setExtras(this.mExtras);
            return this.f18444b.build();
        }
    }

    public static void addAction(Notification.Builder builder, NotificationCompatBase.Action action) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInputCompatApi20.fromCompat(action.getRemoteInputs())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        if (action.getExtras() != null) {
            builder2.addExtras(action.getExtras());
        }
        builder.addAction(builder2.build());
    }

    public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory2) {
        return getActionCompatFromAction(notification.actions[i], factory, factory2);
    }

    private static NotificationCompatBase.Action getActionCompatFromAction(Notification.Action action, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory2) {
        return factory.build(action.icon, action.title, action.actionIntent, action.getExtras(), RemoteInputCompatApi20.toCompat(action.getRemoteInputs(), factory2));
    }

    private static Notification.Action getActionFromActionCompat(NotificationCompatBase.Action action) {
        Notification.Action.Builder builderAddExtras = new Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent()).addExtras(action.getExtras());
        RemoteInputCompatBase.RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs != null) {
            for (android.app.RemoteInput remoteInput : RemoteInputCompatApi20.fromCompat(remoteInputs)) {
                builderAddExtras.addRemoteInput(remoteInput);
            }
        }
        return builderAddExtras.build();
    }

    public static NotificationCompatBase.Action[] getActionsFromParcelableArrayList(ArrayList<Parcelable> arrayList, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory2) {
        if (arrayList == null) {
            return null;
        }
        NotificationCompatBase.Action[] actionArrNewArray = factory.newArray(arrayList.size());
        for (int i = 0; i < actionArrNewArray.length; i++) {
            actionArrNewArray[i] = getActionCompatFromAction((Notification.Action) arrayList.get(i), factory, factory2);
        }
        return actionArrNewArray;
    }

    public static ArrayList<Parcelable> getParcelableArrayListForActions(NotificationCompatBase.Action[] actionArr) {
        if (actionArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList<>(actionArr.length);
        for (NotificationCompatBase.Action action : actionArr) {
            arrayList.add(getActionFromActionCompat(action));
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static String getGroup(Notification notification) {
        return notification.getGroup();
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static String getSortKey(Notification notification) {
        return notification.getSortKey();
    }
}
