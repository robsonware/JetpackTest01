package app.robsonware.jetpacktest01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.robsonware.jetpacktest01.ui.theme.JetpackTest01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTest01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Text(text = "koéé $name!")
    }
}

data class Mensagem(val autor: String, val conteudo: String)

@Composable
fun CartaoMensagem(mensagem: Mensagem) {
    Row {
        Image(
            painter = painterResource(R.drawable.bah),
            contentDescription = "Logo...",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = mensagem.autor)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = mensagem.conteudo)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackTest01Theme {
        CartaoMensagem(
            mensagem = Mensagem("Robson", "Fala putaranho blz?")
        )
    }
}