from flask import Flask, request, jsonify
app = Flask(__name__)

@app.route('/health')
def health():
    return "ok"

@app.route('/transcribe', methods=['POST'])
def transcribe():
    # This stub returns a dummy transcript. Replace with actual whisper integration.
    data = request.json or {}
    return jsonify({
        "transcript": "This is a stub transcript. Replace with Whisper processing.",
        "segments": []
    })

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
