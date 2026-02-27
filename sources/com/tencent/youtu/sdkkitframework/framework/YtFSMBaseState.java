package com.tencent.youtu.sdkkitframework.framework;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class YtFSMBaseState {
    public static final String TAG = "YtFSMBaseState";
    public boolean isFirstEnter = true;
    public AtomicBoolean isPause = new AtomicBoolean(false);
    public long printFrameLogTime;
    public HashMap<String, Object> stateData;
    public String stateName;
    public String stateSimpleName;

    public boolean containsKey(String str) {
        return this.stateData.containsKey(str);
    }

    public void enter() {
        YtSDKStats.getInstance().enterState(this.stateSimpleName);
        if (this.isFirstEnter) {
            this.isFirstEnter = false;
            enterFirst();
        }
        YtLogger.d(TAG, this.stateName + " enter");
    }

    public abstract void enterFirst();

    public void exit() {
        YtLogger.d(TAG, this.stateName + " exit");
    }

    public Object getStateDataBy(String str) {
        return this.stateData.get(str);
    }

    public String getStateName() {
        return this.stateName;
    }

    public String getStateSimpleName() {
        return this.stateSimpleName;
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
    }

    public void handleStateAction(String str, Object obj) {
    }

    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        this.stateName = str;
        try {
            this.stateSimpleName = Class.forName(str).getSimpleName();
        } catch (Exception e) {
            this.stateSimpleName = str.split("\\.")[r2.length - 1];
            YtLogger.e(TAG, "load state with catch error:", e);
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
        }
        YtLogger.i(TAG, "load " + this.stateSimpleName);
        this.stateData = new HashMap<>();
        YtSDKStats.getInstance().registerStateName(this.stateSimpleName);
        updateSDKSetting(jSONObject);
    }

    public JSONObject makeStateInfo(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state_name", str);
            jSONObject.put("state_code", i);
            return jSONObject;
        } catch (JSONException e) {
            YtLogger.e(TAG, "make log info error", e);
            return jSONObject;
        }
    }

    public void moveToNextState() {
        YtLogger.d(TAG, this.stateName + " move to next");
    }

    public void onPause() {
        this.isPause.getAndSet(true);
    }

    public void onResume() {
        this.isPause.getAndSet(false);
    }

    public void reset() {
        this.isFirstEnter = true;
        this.stateData.clear();
        YtLogger.i(TAG, this.stateName + " reset");
    }

    public void sendFSMTransitError(String str) {
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(str) { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState.1
            public final /* synthetic */ String val$stateName;

            {
                this.val$stateName = str;
                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.MSG_INNER_ERROR, "fsm transit next round  error:" + str));
            }
        });
    }

    public void unload() {
        YtLogger.i(TAG, "unload " + this.stateSimpleName);
        this.stateData.clear();
    }

    public void update(YTImageData yTImageData, long j) {
        YtSDKStats.getInstance().updateState(this.stateName);
        if (System.currentTimeMillis() - this.printFrameLogTime > ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            this.printFrameLogTime = System.currentTimeMillis();
            YtLogger.d(TAG, this.stateName + " update bgr image width:" + yTImageData.getWidth() + ",height:" + yTImageData.height);
        }
    }

    public void updateDataBy(String str, Object obj) {
        this.stateData.put(str, obj);
    }

    public void updateSDKSetting(JSONObject jSONObject) {
    }
}
