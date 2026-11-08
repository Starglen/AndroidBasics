package com.starglen.zawadimart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class LearningModule(
    val title: String,
    val description: String,
    val concept: String
)

@Composable
fun StudyHomeScreen() {
    val modules = listOf(
        LearningModule(
            title = "Project Structure",
            description = "Understand the app folder, manifest, and source tree.",
            concept = "Android Studio + package layout"
        ),
        LearningModule(
            title = "Compose UI",
            description = "Build screens with composables, text, and layout containers.",
            concept = "Text, Column, Row, Box"
        ),
        LearningModule(
            title = "State",
            description = "Track user actions and UI changes in a simple app.",
            concept = "remember, mutableStateOf"
        ),
        LearningModule(
            title = "Navigation",
            description = "Move between screens in a real mobile app flow.",
            concept = "NavHost + routes"
        ),
        LearningModule(
            title = "Lists and Cards",
            description = "Display reusable items in a practical layout.",
            concept = "LazyColumn + Card"
        )
    )

    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            Text(
                text = "Android Basics Study Path",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Build small, practical screens and learn the patterns that power Android apps.",
                style = MaterialTheme.typography.bodyLarge
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(modules) { module ->
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = module.title,
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = module.description,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Text(
                                text = "Concept: ${module.concept}",
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }
    }
}
