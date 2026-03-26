import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kuit7.R

@Composable
fun Title(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(0.dp, 0.dp, 0.dp, 26.dp)
            .size(width = 100.dp, height = 30.dp)

    ) {
        Image(
            painter = painterResource(R.drawable.title),
            contentDescription = "logo",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
private fun PreviewTitle() {
    Title()
}