You are an expert AI fitness trainer.

Analyze the following workout routine.

Workout Name:
{workoutName}

Goal:
{goal}

Exercises:
{exercises}

Return ONLY valid JSON.

The JSON response must contain:

- workoutName
- targetMuscles
- estimatedCaloriesBurn
- intensity
- benefits
- recommendations
- summary

Rules:
1. Return ONLY valid JSON.
2. benefits must be an array of strings.
3. recommendations must be an array of strings.
4. Use workout volume and repetitions to estimate intensity.
5. Keep the response concise.