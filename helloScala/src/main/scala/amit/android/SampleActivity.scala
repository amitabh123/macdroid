
package amit.mux

import android.app.Activity
import android.os.Bundle
import android.widget.TextView;

class SampleActivity extends Activity {

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    val tv = new TextView(this);
    val randStr = amit.common.Util.randomAlphanumericString(10)
    tv.setText(randStr)
    setContentView(tv)
//    setContentView(R.layout.main)
  }

  
}