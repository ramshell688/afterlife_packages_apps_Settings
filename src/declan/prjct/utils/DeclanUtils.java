package declan.prjct.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.content.res.Resources;
import androidx.annotation.ColorInt;
import java.util.Random;

public class DeclanUtils {
	
	public static int dpToPx(float dp) {
		return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
		Resources.getSystem().getDisplayMetrics()));
	}
	
	@ColorInt
	public static int getColorAttr(Context context, int attr) {
		TypedArray ta = context.obtainStyledAttributes(new int[] {attr});
		@ColorInt int color = ta.getColor(0, 0);
		ta.recycle();
		return color;
	}
	
	public static int getLightDarkColor(Context context, int lightColor, int darkColor) {
        Resources res = context.getResources();
        return !isThemeDark(context) ? res.getColor(lightColor) : res.getColor(darkColor);
    }
    private static Boolean isThemeDark(Context context) {
        switch (context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
            case Configuration.UI_MODE_NIGHT_YES:
                return true;
            case Configuration.UI_MODE_NIGHT_NO:
                return false;
            default:
                return false;
        }
    }
}