package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {

    @NonNull
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @NonNull
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    @VisibleForTesting(otherwise = 3)
    public FusedLocationProviderClient(@NonNull Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final Task zza(final com.google.android.gms.internal.location.zzbf zzbfVar, final ListenerHolder listenerHolder) {
        final zzaq zzaqVar = new zzaq(this, listenerHolder);
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: com.google.android.gms.location.zzan
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                FusedLocationProviderClient fusedLocationProviderClient = this.zza;
                zzaw zzawVar = zzaqVar;
                ListenerHolder listenerHolder2 = listenerHolder;
                ((com.google.android.gms.internal.location.zzbe) obj).zzB(zzbfVar, listenerHolder2, new zzau((TaskCompletionSource) obj2, new zzaf(fusedLocationProviderClient, zzawVar, listenerHolder2), null));
            }
        }).unregister(zzaqVar).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    @NonNull
    public Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzad
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzbe) obj).zzs(new zzav((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2422).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getCurrentLocation(int i, @Nullable final CancellationToken cancellationToken) {
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setPriority(i);
        locationRequestCreate.setInterval(0L);
        locationRequestCreate.setFastestInterval(0L);
        locationRequestCreate.setExpirationDuration(30000L);
        final com.google.android.gms.internal.location.zzbf zzbfVarZzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequestCreate);
        zzbfVarZzc.zzd(true);
        zzbfVarZzc.zze(30000L);
        if (cancellationToken != null) {
            Preconditions.checkArgument(true ^ cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task taskDoRead = doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzaa
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                FusedLocationProviderClient fusedLocationProviderClient = this.zza;
                com.google.android.gms.internal.location.zzbf zzbfVar = zzbfVarZzc;
                CancellationToken cancellationToken2 = cancellationToken;
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
                builder.setPriority(zzbfVar.zzb().getPriority());
                builder.setDurationMillis(zzbfVar.zzb().getExpirationTime() != Long.MAX_VALUE ? zzbfVar.zzb().getExpirationTime() - SystemClock.elapsedRealtime() : Long.MAX_VALUE);
                builder.setMaxUpdateAgeMillis(zzbfVar.zza());
                builder.zza(zzbfVar.zzg());
                List<ClientIdentity> listZzf = zzbfVar.zzf();
                WorkSource workSource = new WorkSource();
                for (ClientIdentity clientIdentity : listZzf) {
                    WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
                builder.zzb(workSource);
                zzbeVar.zzt(builder.build(), cancellationToken2, new zzap(fusedLocationProviderClient, taskCompletionSource));
            }
        }).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWith(new Continuation() { // from class: com.google.android.gms.location.zzag
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((Location) task.getResult());
                    return null;
                }
                taskCompletionSource2.trySetException((Exception) Preconditions.checkNotNull(task.getException()));
                return null;
            }
        });
        return taskCompletionSource.getTask();
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzak
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzbe) obj).zzu(new LastLocationRequest.Builder().build(), new zzat(this.zza, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2414).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzae
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.internal.location.zzbe) obj).zzp());
            }
        }).setMethodKey(2416).build());
    }

    @NonNull
    public Task<Void> removeLocationUpdates(@NonNull final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzbe) obj).zzA(pendingIntent, new zzav((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2418).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull final PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.zzbf zzbfVarZzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzac
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzbe) obj).zzD(zzbfVarZzc, pendingIntent, new zzav((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2417).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockLocation(@NonNull final Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzE(location, new zzas(this.zza, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2421).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockMode(final boolean z4) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzab
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzF(z4, new zzas(this.zza, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2420).build());
    }

    @VisibleForTesting(otherwise = 3)
    public FusedLocationProviderClient(@NonNull Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation(@NonNull final LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzu(lastLocationRequest, new zzat(this.zza, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2414).setFeatures(zzy.zzf).build());
    }

    @NonNull
    public Task<Void> removeLocationUpdates(@NonNull LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).continueWith(new Executor() { // from class: com.google.android.gms.location.zzaj
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new Continuation() { // from class: com.google.android.gms.location.zzai
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return null;
            }
        });
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull LocationCallback locationCallback, @Nullable Looper looper) {
        com.google.android.gms.internal.location.zzbf zzbfVarZzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest);
        if (looper == null && (looper = Looper.myLooper()) == null) {
            throw new IllegalStateException();
        }
        return zza(zzbfVarZzc, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationCallback locationCallback) {
        return zza(com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest), ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getCurrentLocation(@NonNull final CurrentLocationRequest currentLocationRequest, @Nullable final CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task taskDoRead = doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzt(currentLocationRequest, cancellationToken, new zzat(this.zza, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzy.zze).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWith(new Continuation() { // from class: com.google.android.gms.location.zzah
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((Location) task.getResult());
                    return null;
                }
                taskCompletionSource2.trySetException((Exception) Preconditions.checkNotNull(task.getException()));
                return null;
            }
        });
        return taskCompletionSource.getTask();
    }
}
