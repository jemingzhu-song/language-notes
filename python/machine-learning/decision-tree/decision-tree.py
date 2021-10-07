import pandas as pd

# Machine Learning algorithms can only work on numbers, they cannot understand labels - so we have to
# convert the data in the three Input columns (Company, Job & Degree), into numbers. This is because
# the machine learning algorithm doesn't understand what "Business Manager" or "Sales Executive" means.
# One way to convert these labels into numbers is through the "LabelEncoder"
from sklearn.preprocessing import LabelEncoder

# Import a decision-tree to train our classifier
from sklearn import tree
 
df = pd.read_csv("salaries.csv")
df.head()

# We want to produce a decision tree that given the inputs/input columns (Company, Job & Degree),
# determines whether the person's salary will be more than 100k or not.

# Inputs (Company, Job & Degree) - drops the last column (Salary_More_Than_100k) since this is
# our Target
inputs = df.drop("salary_more_then_100k", axis="columns")
# Target (Salary_More_Than_100k)
target = df["salary_more_then_100k"]
# print(inputs)

# Converting Input data into numbers...
le_company = LabelEncoder()
le_job = LabelEncoder()
le_degree = LabelEncoder()

# Creates an extra columns in the inputs data frame that contains the original text inputs (Company, Job & Degree)
# represented in number format
inputs['company_n'] = le_company.fit_transform(inputs["company"])
inputs['job'] = le_company.fit_transform(inputs["job"])
inputs['degree'] = le_company.fit_transform(inputs["degree"])
inputs.head()

# Drop the original text inputs (Company, Job & Degree)
inputs_n = inputs.drop(["company", "job", "degree"], axis="columns")
# print(inputs)

# Initialise the decision tree
model = tree.DecisionTreeClassifier()

# Train the model
model.fit(inputs_n, target)

# Predict the score by supplying the input and target data set. The score is 1.0 because we used the same data
# set which we used for training.
model.score(inputs_n, target)

