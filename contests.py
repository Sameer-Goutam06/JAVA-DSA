# Importing necessary libraries
import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score

# Load the dataset
try:
    dataset = pd.read_csv('crop_disease_dataset.csv')
    # Strip any extra spaces in column headers
    dataset.columns = dataset.columns.str.strip()
except FileNotFoundError:
    raise FileNotFoundError("The file 'crop_disease_dataset.csv' was not found. Please ensure it is in the correct directory.")

# Verify dataset columns
print("Dataset Columns:", dataset.columns)
if 'disease' not in dataset.columns:
    raise ValueError("The dataset does not contain a 'disease' column. Please check the column headers.")

# Data preprocessing
X = dataset.drop('disease', axis=1)  # Features
y = dataset['disease']  # Target variable

# Splitting the dataset into the Training set and Testing set
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Training the Random Forest classifier
clf = RandomForestClassifier(n_estimators=100, random_state=42)
clf.fit(X_train, y_train)

# Predicting the Test set results
y_pred = clf.predict(X_test)

# Evaluating the model
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy:", accuracy)

# Example usage
# Define the feature values for a new sample
new_sample = np.array([[26, 78, 210, 6.7]])  # Example feature values

# Convert the new sample to a DataFrame with the same feature names as X
new_sample_df = pd.DataFrame(new_sample, columns=X.columns)

# Make prediction
prediction = clf.predict(new_sample_df)
print("Predicted disease:", prediction[0])