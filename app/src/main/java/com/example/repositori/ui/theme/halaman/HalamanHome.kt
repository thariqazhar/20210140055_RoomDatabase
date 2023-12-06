package com.example.repositori.ui.theme.halaman

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.repositori.R
import com.example.repositori.data.Siswa
import com.example.repositori.navigasi.DestinasiNavigasi

object DestinasiHome: DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun DataSiswa(
    siswa: Siswa,
    modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_large)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

            }
        }
    }
}